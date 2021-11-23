@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.UpdateServiceOperationException.class)
public void shouldThrowUpdateServiceOperationExceptionBecauseGivenUserDoesNotExistInDatabase() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.dao.exceptions.UpdateDaoOperationException, com.rsternal.mhbl.main.service.exceptions.UpdateServiceOperationException {
    org.mockito.Mockito.when(dao.findById(org.mockito.Matchers.any(com.rsternal.mhbl.dao.model.UserEntity.class))).thenThrow(com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException.class);
    service.update(new dao.model.security.User());
    org.mockito.Mockito.verify(dao, org.mockito.internal.verification.VerificationModeFactory.times(0)).update(org.mockito.Matchers.any(com.rsternal.mhbl.dao.model.UserEntity.class));
}