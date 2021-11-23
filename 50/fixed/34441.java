@org.junit.Test
public void testFind() {
    com.excilys.dao.Computer expected = comp1;
    com.excilys.dao.Computer actual = computers.getComputer(1);
    assertEquals(expected, actual);
}