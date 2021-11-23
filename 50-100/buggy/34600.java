@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.UpdateServiceOperationException.class)
public void shouldThrowUpdateServiceOperationExceptionBecauseSomeExceptionHasBeenOccurredDuringUpdate() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.dao.exceptions.UpdateDaoOperationException, com.rsternal.mhbl.main.service.exceptions.UpdateServiceOperationException {
    org.mockito.Mockito.when(dao.findById(org.mockito.Matchers.any(com.rsternal.mhbl.dao.model.UserEntity.class))).thenReturn(new com.rsternal.mhbl.dao.model.UserEntity());
    org.mockito.Mockito.doThrow(com.rsternal.mhbl.dao.exceptions.UpdateDaoOperationException.class).when(dao).update(org.mockito.Matchers.any(com.rsternal.mhbl.dao.model.UserEntity.class));
    service.update(new dao.model.security.User());
}