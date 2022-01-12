public void testForTwoValuesAndAdditionOperand() throws java.lang.Exception {
    java.lang.StringBuilder input = new java.lang.StringBuilder();
    input.append("1");
    input.append(",");
    input.append("2");
    input.append(",");
    input.append("+");
    assertEquals(new java.lang.Double(3.0), rpnCalculator.calculateResult(input.toString()));
}