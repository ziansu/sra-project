@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test(expected = com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException.class)
public void shouldNotFindUserInDatabaseForGivenUser() throws com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException, com.rsternal.mhbl.main.service.exceptions.ServiceDataNotFoundException {
    org.mockito.Mockito.when(dao.findById(org.mockito.Matchers.anyString())).thenThrow(com.rsternal.mhbl.dao.exceptions.DaoDataNotFoundException.class);
    service.findById("any.login");
    org.mockito.Mockito.verify(dao).findById(org.mockito.Matchers.anyString());
}