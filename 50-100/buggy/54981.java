@org.junit.Test
public void testMailboxDecode() throws java.lang.Exception {
    java.lang.String mbox = "Entw\u00fcrfe";
    com.sun.mail.imap.protocol.IMAPResponse response = new com.sun.mail.imap.protocol.IMAPResponse((("* STATUS " + (com.sun.mail.imap.protocol.BASE64MailboxEncoder.encode(mbox))) + " (MESSAGES 231 UIDNEXT 44292)"));
    com.sun.mail.imap.protocol.Status s = new com.sun.mail.imap.protocol.Status(response);
    org.junit.Assert.assertEquals(mbox, s.mbox);
    org.junit.Assert.assertEquals(231, s.total);
    org.junit.Assert.assertEquals(44292, s.uidnext);
}