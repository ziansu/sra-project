@org.junit.Test
public void selectNonexistentUser() throws by.bsuir.deliveryservice.service.ServiceException {
    long userId = -1L;
    by.bsuir.deliveryservice.entity.User user = userService.viewUser(userId);
    assertNull(user);
}