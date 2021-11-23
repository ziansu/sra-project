@org.junit.Test
public void dispatchShouldCallCommandExecute() throws java.lang.Exception {
    subject.add("test", testCommand);
    doReturn(null).when(testCommand).execute(org.mockito.Matchers.any());
    subject.dispatch(new java.lang.String[]{ "test" });
    verify(testCommand).execute(org.mockito.Matchers.any());
}