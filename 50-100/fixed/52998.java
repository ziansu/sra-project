@org.junit.Test
public void shouldNotAddNewUserWhenGivenUserExistInDatabase() throws com.rsternal.mhbl.dao.exceptions.AddDaoOperationException, com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.AddServiceOperationException {
    dao.model.security.User user = new dao.model.security.User();
    com.rsternal.mhbl.dao.model.UserEntity userEntity = new com.rsternal.mhbl.dao.model.UserEntity();
    when(dao.findById(org.mockito.Matchers.anyString())).thenReturn(userEntity);
    service.add(user);
    verify(dao).findById(org.mockito.Matchers.anyString());
    verify(dao, org.mockito.internal.verification.VerificationModeFactory.times(0)).add(org.mockito.Matchers.any(com.rsternal.mhbl.dao.model.UserEntity.class));
}