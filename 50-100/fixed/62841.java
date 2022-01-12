@org.junit.Test
public void untrustTest() throws be.maximvdw.spigotsite.api.user.exceptions.InvalidCredentialsException, be.maximvdw.spigotsite.api.user.exceptions.TwoFactorAuthenticationException {
    be.maximvdw.spigotsite.api.user.User user = be.maximvdw.spigotsite.UserDebugging.getUser();
    be.maximvdw.spigotsite.user.SpigotUserManager userManager = ((be.maximvdw.spigotsite.user.SpigotUserManager) (be.maximvdw.spigotsite.api.SpigotSite.getAPI().getUserManager()));
    userManager.untrustThisDevice(user);
    assertTrue(userManager.isLoggedIn(user));
}