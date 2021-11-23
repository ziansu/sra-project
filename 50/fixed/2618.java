@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void testFindShouldHaveValidId() {
    com.excilys.core.model.Computer result = this.computerDAO.find((-1L));
    assertNull(result);
    result = this.computerDAO.find(0L);
    assertNull(result);
}