@org.junit.Test
public void dispatchShouldPassCorrectArguments() throws java.lang.Exception {
    subject.add("test", testCommand);
    doReturn(null).when(testCommand).execute(org.mockito.Matchers.any());
    subject.dispatch(new java.lang.String[]{ "test" , "a" , "b" , "c" });
    verify(testCommand).execute(new java.lang.String[]{ "a" , "b" , "c" });
}