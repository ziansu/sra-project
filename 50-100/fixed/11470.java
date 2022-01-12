@org.junit.Test
public void addStringSimpleException() throws java.lang.Exception {
    try {
        firstOperand = new cpe200.Operand("-1");
        secondOperand = new cpe200.Operand("1");
        binaryCalculator.setFirstOperand(firstOperand);
        binaryCalculator.setSecondOperand(secondOperand);
    } catch (java.lang.Exception ex) {
        fail("Not expect exception here");
    }
    try {
        binaryCalculator.add();
        fail("Expect an exception to be thrown before here");
    } catch (java.lang.RuntimeException ex) {
        assertTrue(true);
    } catch (java.lang.Exception ex) {
        fail("Expect runtime exception, but the other is thrown");
    }
}