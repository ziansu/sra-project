@org.junit.Test
public void shouldReturnUserListBecauseUsersExistsInDatabase() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    java.util.List<com.rsternal.mhbl.dao.model.UserEntity> users = new java.util.ArrayList<>();
    users.add(new com.rsternal.mhbl.dao.model.UserEntity());
    users.add(new com.rsternal.mhbl.dao.model.UserEntity());
    org.mockito.Mockito.when(dao.findAll()).thenReturn(users);
    java.util.List<dao.model.security.User> foundUsers = service.findAll();
    org.mockito.Mockito.verify(dao).findAll();
    org.junit.Assert.assertEquals(foundUsers.size(), 2);
}