@org.junit.Test
public void dispatchShouldPassException() throws java.lang.Exception {
    java.lang.Exception expected = new java.lang.Exception("Fake reason");
    doThrow(expected).when(testCommand).execute(org.mockito.Matchers.any());
    try {
        subject.dispatch(new java.lang.String[]{ "test" });
        org.junit.Assert.fail("Did not pass exception");
    } catch (java.lang.Exception ex) {
        org.junit.Assert.assertSame(expected, ex);
    }
}