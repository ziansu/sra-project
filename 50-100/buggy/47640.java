@org.junit.Test
public void testCreate() {
    com.excilys.cdb.utils.ExecuteScript.execute();
    com.excilys.dao.Computer expected = new com.excilys.dao.Computer("test", null, java.time.LocalDate.of(2000, 1, 2), c1, 4);
    int id = computers.addComputer(expected);
    com.excilys.dao.Computer actual = computers.getComputer(id);
    assertFalse(actual.equals(null));
    assertEquals(expected, actual);
}