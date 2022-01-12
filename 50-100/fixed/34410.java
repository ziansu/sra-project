@org.junit.Test
public void dispatchShouldCallCommandExecute() throws java.lang.Exception {
    doReturn(null).when(testCommand).execute(org.mockito.Matchers.any());
    subject.dispatch(new java.lang.String[]{ "test" });
    verify(testCommand).execute(org.mockito.Matchers.any());
}