@org.junit.Test
public void avoidDuplicateUser() {
    de.fred4jupiter.fredbet.domain.AppUser appUser = de.fred4jupiter.fredbet.domain.AppUserBuilder.create().withUsernameAndPassword("michael", "michael").withRole(FredBetRole.ROLE_USER).build();
    userService.insertAppUser(appUser);
    try {
        userService.insertAppUser(appUser);
        org.junit.Assert.fail("UserAlreadyExistsException should be thrown");
    } catch (de.fred4jupiter.fredbet.service.UserAlreadyExistsException e) {
    }
}