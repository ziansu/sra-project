@org.junit.Test
public void shouldReturnMaxValueWhenSumLittleThanMinValue() {
    intLogger.log((-101));
    intLogger.log(((java.lang.Integer.MIN_VALUE) + 1));
    java.lang.String data = intLogger.getData();
    org.junit.Assert.assertEquals((("primitive: -100" + (java.lang.System.lineSeparator())) + (java.lang.String.valueOf(java.lang.Integer.MIN_VALUE))), data);
}