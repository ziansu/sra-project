@org.junit.Test
public void rule_threw_exception() throws java.lang.Throwable {
    rule.expectThrowable(java.lang.AssertionError.class, "x");
    rule.apply(new org.junit.runners.model.Statement() {
        public void evaluate() throws java.lang.Throwable {
            throw new java.lang.AssertionError("x");
        }
    }, org.mockito.Mockito.mock(org.junit.runners.model.FrameworkMethod.class), this).evaluate();
    assertEquals(rule.getReportedThrowable().getMessage(), "x");
}