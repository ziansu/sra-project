@org.junit.Test
public void shouldReturnUserListBecauseUsersExistsInDatabase() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    java.util.List<com.rsternal.mhbl.dao.model.UserEntity> users = new java.util.ArrayList<>();
    users.add(new com.rsternal.mhbl.dao.model.UserEntity());
    users.add(new com.rsternal.mhbl.dao.model.UserEntity());
    when(dao.findAll()).thenReturn(users);
    java.util.List<dao.model.security.User> foundUsers = service.findAll();
    verify(dao).findAll();
    assertEquals(foundUsers.size(), 2);
}