@org.junit.Test
public void isUserNameAvailableNotAvailableTest() {
    userSecurityService.registerNewUser(gameUser1);
    org.junit.Assert.assertFalse(userSecurityService.isUserNameAvailable(gameUser1.getUsername()));
}