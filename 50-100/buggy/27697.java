@org.junit.Test
public void expected_exception_but_no_exception() throws java.lang.Throwable {
    rule.expectThrowable(java.lang.AssertionError.class, "x");
    try {
        rule.apply(new org.junit.runners.model.Statement() {
            public void evaluate() throws java.lang.Throwable {
            }
        }, org.mockito.Mockito.mock(org.junit.runners.model.FrameworkMethod.class), this).evaluate();
        org.junit.Assert.fail();
    } catch (org.mockitoutil.SafeJUnitRule t) {
    }
}