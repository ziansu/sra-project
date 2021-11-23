@org.junit.Test
public void testgetAll() {
    java.util.List<com.excilys.cdb.model.Computer> listComputer = ctdao.getAll();
    assertNotNull(listComputer);
    com.excilys.cdb.model.Computer comp = ctdao.getById(1);
    assertEquals(listComputer.get(0), comp);
    int sizeDB = ctdao.getAPage(1, 50, "", 1).getNbTotalComputer();
    assertEquals(listComputer.size(), sizeDB);
}