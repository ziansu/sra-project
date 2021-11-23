@org.junit.Test
public void validSignIn() throws by.bsuir.deliveryservice.service.ServiceException {
    by.bsuir.deliveryservice.entity.User user = new by.bsuir.deliveryservice.entity.User("test", "test", "test", "test", "test");
    userService.registerUser(user);
    user = userService.loginUser(new by.bsuir.deliveryservice.entity.User("test", "test"));
    assertNotNull(user);
    assertEquals(user.getRole(), UserRole.CLIENT);
}