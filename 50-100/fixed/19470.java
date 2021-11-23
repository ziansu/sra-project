@org.junit.Test
public void testAuthenticate() throws java.lang.Exception {
    java.io.File f = java.io.File.createTempFile("users", "db");
    f.deleteOnExit();
    com.whizzosoftware.hobson.security.LocalAccessManager mgr = new com.whizzosoftware.hobson.security.LocalAccessManager(f);
    com.whizzosoftware.hobson.api.security.HobsonUser user = mgr.authenticate("admin", "password");
    assertNotNull(user);
    assertEquals("admin", user.getId());
    assertEquals("Administrator", user.getGivenName());
    assertEquals("User", user.getFamilyName());
    assertNull(user.getEmail());
}