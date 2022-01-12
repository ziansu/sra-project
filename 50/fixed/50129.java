@org.junit.Test
public void testFindAll() {
    final java.util.List<com.musicforall.model.User> users = userService.findAll();
    assertEquals(4, users.size());
}