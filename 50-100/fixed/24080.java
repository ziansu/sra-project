@org.junit.Test
public void testVerifyAccount() {
    final java.lang.String wrongUsername = "wrong-username";
    final java.lang.String wrongPassword = "wrong-password";
    boolean failure = accountService.verifyAccount(wrongUsername, wrongPassword);
    boolean success = accountService.verifyAccount(testConfig.getStudentId(), testConfig.getPassword());
    org.junit.Assert.assertTrue("verify account with correct account", success);
    org.junit.Assert.assertFalse("verify account with wrong account", failure);
}