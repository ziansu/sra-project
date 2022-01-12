@org.junit.Test
public void testVerificationByHashedEmail() throws java.lang.Exception {
    tdbh = new TestDBHandler();
    com.codecool.faceCode.classes.User sampleUser = manager.getUserByID(2);
    java.lang.String sampleEmail = sampleUser.getEmail();
    tdbh.addVerification(sampleUser);
    boolean result = tdbh.verifyUserByID(manager.getUserByHashedEmail(sampleEmail.hashCode()).getId());
    org.junit.Assert.assertEquals(true, result);
}