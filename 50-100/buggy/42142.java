@org.junit.Test
public void expected_exception_type_did_not_match() throws java.lang.Throwable {
    rule.expectThrowable(java.lang.AssertionError.class, "x");
    try {
        rule.apply(new org.junit.runners.model.Statement() {
            public void evaluate() throws java.lang.Throwable {
                throw new java.lang.RuntimeException("x");
            }
        }, org.mockito.Mockito.mock(org.junit.runners.model.FrameworkMethod.class), this).evaluate();
        org.junit.Assert.fail();
    } catch (java.lang.AssertionError throwable) {
        org.assertj.core.api.Assertions.assertThat(throwable).hasMessageContaining("but was instance of");
    }
}