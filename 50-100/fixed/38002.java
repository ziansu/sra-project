@org.junit.Test
public void shouldReturnAllUsersSuccessfully() {
    java.util.List<eu.execom.labs.teamodoro.entity.User> allUsers = new java.util.ArrayList<>();
    allUsers.add(eu.execom.labs.teamodoro.entity.EntityBuilder.user());
    org.mockito.Mockito.when(userRepository.findAll()).thenReturn(allUsers);
    java.util.List<eu.execom.labs.teamodoro.entity.User> listUser = userService.findAllUsers();
    org.junit.Assert.assertFalse("List is not empty", listUser.isEmpty());
    org.mockito.Mockito.verify(userRepository).findAll();
}