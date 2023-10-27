import java.util.Random;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class RandomObjectCreation {
    public static void main(String[] args) {
        Random random = new Random();
        int numObjects = 5; // Change this to the desired number of objects

        Person[] people = new Person[numObjects];

        for (int i = 0; i < numObjects; i++) {
            String randomName = "Person" + i;
            int randomAge = random.nextInt(50) + 18; // Random age between 18 and 67

            people[i
