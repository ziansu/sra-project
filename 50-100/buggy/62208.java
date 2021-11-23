@org.junit.Test
public void validSignIn() throws by.bsuir.deliveryservice.service.ServiceException {
    by.bsuir.deliveryservice.entity.User user = new by.bsuir.deliveryservice.entity.User("test", by.bsuir.deliveryservice.service.util.Hasher.md5Hash("test"), "test", "test", "test");
    userService.registerUser(user);
    user = userService.loginUser(user);
    assertNotNull(user);
    assertEquals(user.getRole(), UserRole.CLIENT);
}