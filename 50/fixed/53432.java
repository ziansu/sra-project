@org.junit.Test
public void testCheckout() throws java.lang.Exception {
    tfsCommand.checkout(workDir, revision);
    verify(tfsCommand, times(1)).retrieveFiles(workDir, revision);
    verifyMocks();
}