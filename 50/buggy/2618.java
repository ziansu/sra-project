@org.junit.Test
public void testFindShouldHaveValidId() throws com.excilys.persistence.dao.DAOException {
    com.excilys.core.model.Computer result = this.computerDAO.find((-1L));
    org.junit.Assert.assertNull(result);
    result = this.computerDAO.find(0L);
    org.junit.Assert.assertNull(result);
}