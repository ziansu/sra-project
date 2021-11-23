@org.junit.Test
public void shouldReturnMaxValuewhenSumMoreThanMaxValue() {
    intLogger.log(101);
    intLogger.log(((java.lang.Integer.MAX_VALUE) - 1));
    java.lang.String data = intLogger.getData();
    org.junit.Assert.assertEquals(((("primitive: 100" + (java.lang.System.lineSeparator())) + (java.lang.String.valueOf(java.lang.Integer.MAX_VALUE))) + (java.lang.System.lineSeparator())), data);
}