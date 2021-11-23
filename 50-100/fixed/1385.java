@org.junit.Before
public void beforeTest() throws java.lang.Exception {
    validator = createValidator();
    validator.setGeometryStore(org.mockito.Mockito.mock(nl.ipo.cds.etl.postvalidation.IGeometryStore.class));
    validator.setManagerDao(org.mockito.Mockito.mock(nl.ipo.cds.dao.ManagerDao.class));
    runner = new nl.ipo.cds.etl.test.ValidationRunner(validator, getDomainClass());
}