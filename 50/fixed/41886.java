@org.junit.Test
public void isUserNameAvailableTest() {
    userSecurityService.registerNewUser(gameUser1);
    org.junit.Assert.assertTrue(userSecurityService.isUserNameAvailable("userName2"));
}