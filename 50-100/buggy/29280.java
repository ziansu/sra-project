@org.junit.Test
public void verify_no_more_interactions_ignores_stubs() throws java.lang.Throwable {
    org.mockito.BDDMockito.given(mock.simpleMethod(10)).willReturn("foo");
    mock.simpleMethod(10);
    mock.otherMethod();
    org.mockito.Mockito.verify(mock).otherMethod();
    org.mockito.Mockito.verifyNoMoreInteractions(mock);
    org.junit.Assert.assertNull(rule.getReportedThrowable());
}