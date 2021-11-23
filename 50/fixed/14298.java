@org.junit.Test
public void isEmailAvailableNotAvailableTest() {
    userSecurityService.registerNewUser(gameUser1);
    org.junit.Assert.assertFalse(userSecurityService.isEmailAvailable(context.getBean("gameUser1", org.moshe.arad.repositories.entities.GameUser.class).getEmail()));
}