@org.junit.Test
public void testIsUsernameAvailable_availableUsername() {
    org.mockito.Mockito.when(userDao.findByUsername("notExistingUser")).thenReturn(null);
    org.junit.Assert.assertTrue(userService.isUsernameAvailable("notExistingUser"));
}