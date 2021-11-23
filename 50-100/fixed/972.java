@org.junit.Test
public void expected_exception_message_did_not_match() throws java.lang.Throwable {
    rule.expectThrowable(java.lang.AssertionError.class, "FOO");
    try {
        rule.apply(new org.junit.runners.model.Statement() {
            public void evaluate() throws java.lang.Throwable {
                throw new java.lang.AssertionError("BAR");
            }
        }, org.mockito.Mockito.mock(org.junit.runners.model.FrameworkMethod.class), this).evaluate();
        fail();
    } catch (java.lang.AssertionError throwable) {
        org.assertj.core.api.Assertions.assertThat(throwable).hasMessageContaining("Expecting message");
    }
}