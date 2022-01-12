@org.junit.Test
public void dispatchShouldPassReturnValue() throws java.lang.Exception {
    java.lang.Object expectedReturn = new java.lang.Object();
    doReturn(expectedReturn).when(testCommand).execute(org.mockito.Matchers.any());
    java.lang.Object result = subject.dispatch(new java.lang.String[]{ "test" });
    org.junit.Assert.assertSame(expectedReturn, result);
}