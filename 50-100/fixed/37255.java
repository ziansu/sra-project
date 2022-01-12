@org.junit.Test
public void TestMultiplesOfFive() {
    kata.FizzBuzz fizzBuzz = new kata.FizzBuzz();
    fizzBuzz.run();
    java.util.Random r = new java.util.Random();
    int multipleOfFive = (r.ints(1, (20 + 1)).findFirst().getAsInt()) * 5;
    assertTrue(fizzBuzz.getValueForPosition(multipleOfFive).toString().contains("Buzz"));
}