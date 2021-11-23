@org.junit.Test
public void testFindAll() {
    com.excilys.cdb.utils.ExecuteScript.execute();
    boolean isList = (ComputerService.INSTANCE.getAll()) instanceof java.util.List<?>;
    assertTrue(isList);
    java.util.List<com.excilys.dao.Computer> l = ComputerService.INSTANCE.getAll();
    assertEquals(3, l.size());
    assertTrue(expectedList.equals(l));
}