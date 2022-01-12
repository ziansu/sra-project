@org.junit.Test(timeout = 15000)
public void getUserByIdTest() {
    java.lang.System.out.println("Testing 'getUserById 1' ...");
    be.maximvdw.spigotsite.api.user.UserManager userManager = be.maximvdw.spigotsite.api.SpigotSite.getAPI().getUserManager();
    be.maximvdw.spigotsite.api.user.User user = userManager.getUserById(1);
    java.lang.System.out.println(("Username: " + (user.getUsername())));
    java.lang.System.out.println(("User Id: " + (user.getUserId())));
    assertEquals(1, user.getUserId());
    assertEquals("md_5", user.getUsername());
}