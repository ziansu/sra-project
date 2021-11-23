@java.lang.SuppressWarnings(value = "UnusedAssignment")
public void testGetOnlineUsers() throws java.lang.Exception {
    alex.imhere.layer.server.Session session = serverAPI.login(udid);
    java.util.ArrayList<alex.imhere.layer.server.Session> users = serverAPI.getOnlineUsers();
    assertEquals("Must be only one user", 1, users.size());
    serverAPI.logout(session);
}