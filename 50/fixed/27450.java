@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException.class)
public void shouldNotFindAnyUserBecauseAnyUserExistInDatabase() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    when(dao.findAll()).thenThrow(com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException.class);
    service.findAll();
    verify(dao).findAll();
}