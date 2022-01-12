protected void verifyElementInListVariable(java.lang.String variable, int element, double realPart, double complexPart) {
    org.apache.commons.math3.complex.Complex actual = calculator.getMemory().getListVariableValue(variable).list().get(element);
    org.hamcrest.MatcherAssert.assertThat(org.xlrnet.tibaija.memory.Value.of(actual), new org.xlrnet.tibaija.matchers.EqualsWithComplexDeltaMatcher(realPart, complexPart, org.xlrnet.tibaija.test.TestUtils.DEFAULT_TOLERANCE));
}