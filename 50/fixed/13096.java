@org.junit.Test
public void testEMailObject() {
    mailObject = new net.sf.memoranda.EMailObject();
    assertTrue(((mailObject.equals(null)) != true));
}