@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException.class)
public void shouldNotFindAnyUserBecauseAnyUserExistInDatabase() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    org.mockito.Mockito.when(dao.findAll()).thenThrow(com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException.class);
    service.findAll();
    org.mockito.Mockito.verify(dao).findAll();
}