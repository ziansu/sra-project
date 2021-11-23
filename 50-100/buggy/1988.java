@org.junit.Test
public void testCreateFolder() throws java.lang.Exception {
    java.lang.String folderName = "newFolder";
    com.zimbra.client.ZMailbox zmbox = com.zimbra.qa.unittest.TestUtil.getZMailbox(com.zimbra.qa.unittest.SharedImapTests.USER);
    connection = connect(imapServer);
    connection.login(com.zimbra.qa.unittest.SharedImapTests.PASS);
    com.zimbra.qa.unittest.TestUtil.createFolder(zmbox, folderName);
    com.zimbra.cs.mailclient.imap.MailboxInfo info = connection.select(folderName);
    org.junit.Assert.assertEquals(folderName, info.getName());
}