@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException.class)
public void shouldNotFindUserInDatabaseForGivenUser() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    when(dao.findById(org.mockito.Matchers.anyString())).thenThrow(com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException.class);
    service.findById("any.login");
    verify(dao).findById(org.mockito.Matchers.anyString());
}