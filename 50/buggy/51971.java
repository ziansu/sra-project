@org.junit.Test
public void test_negativeNumbers() throws StringCalculatorException {
    StringCalculator cal = new StringCalculator();
    int sum = cal.add("-5,6");
    assertEquals(1, sum);
}