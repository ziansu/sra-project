@org.junit.Test
public void testFind_shouldReturnEmptyList() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Reservation matcher = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Reservation();
    try {
        matcher.setIdentity(0L);
        while (!(reservationDAO.find(matcher).isEmpty())) {
            matcher.setIdentity(((matcher.getIdentity()) + 1L));
        } 
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        fail("DAOException should not occur while searching for a non-existing reservation identity");
    }
    java.util.List<com.at.ac.tuwien.sepm.ss15.edulium.domain.Reservation> result = reservationDAO.find(matcher);
    assertEquals(0, result.size());
}