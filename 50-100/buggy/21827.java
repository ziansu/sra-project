@org.junit.Test
public void testVerificationByHashedEmail() {
    try {
        tdbh = new TestDBHandler();
        com.codecool.faceCode.classes.User sampleUser = manager.getUserByID(2);
        java.lang.String sampleEmail = sampleUser.getEmail();
        tdbh.addVerification(sampleUser);
        boolean result = tdbh.verifyUserByID(manager.getUserByHashedEmail(sampleEmail.hashCode()).getId());
        org.junit.Assert.assertEquals(true, result);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        org.junit.Assert.fail("It has gone to shit somewhere");
    }
}