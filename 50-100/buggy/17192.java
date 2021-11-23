@org.junit.Test
public void dispatchShouldPassReturnValue() throws java.lang.Exception {
    subject.add("test", testCommand);
    java.lang.Object expectedReturn = new java.lang.Object();
    doReturn(expectedReturn).when(testCommand).execute(org.mockito.Matchers.any());
    java.lang.Object result = subject.dispatch(new java.lang.String[]{ "test" });
    org.junit.Assert.assertSame(expectedReturn, result);
}