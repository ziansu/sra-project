@org.junit.Test
public void testChangePassword() throws java.lang.Exception {
    java.lang.String newPass = "new123";
    userService.changePassword(initUser, initUser.getEncryptedPassword(), newPass);
    org.junit.Assert.assertEquals(newPass, initUser.getEncryptedPassword());
}