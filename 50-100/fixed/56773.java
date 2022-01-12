@org.junit.Test
public void testNonExistentFolder() throws com.zimbra.common.service.ServiceException, java.io.IOException, javax.mail.MessagingException {
    java.lang.String nonExistentFolderName = "SharedImapTests-NonExistentFolder";
    connection = connect();
    connection.login(com.zimbra.qa.unittest.SharedImapTests.PASS);
    try {
        connection.select(nonExistentFolderName);
        org.junit.Assert.fail(java.lang.String.format("'SELECT %s succeeded when it shouldn't have'", nonExistentFolderName));
    } catch (com.zimbra.cs.mailclient.CommandFailedException cfe) {
        java.lang.String err = cfe.getError();
        java.lang.String expected = "SELECT failed";
        org.junit.Assert.assertTrue(java.lang.String.format("CommandFailedException error should contain '%s', was '%s'", err, expected), err.contains(expected));
    }
}