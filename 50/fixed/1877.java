@org.junit.Test(expected = org.yj.smtpstub.exception.InvalidStoreException.class)
public void testGetMailStoreInvalidInheritedType() throws org.yj.smtpstub.exception.InvalidStoreException {
    java.lang.String type = java.lang.String.class.getCanonicalName();
    java.lang.Object obj = org.yj.smtpstub.storage.MailStoreFactory.getMailStore(type);
}