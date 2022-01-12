@org.junit.Test
public void testCreate() {
    com.janantoniak.tests.Cell cell = new com.janantoniak.tests.Cell(3, 2);
    org.junit.Assert.assertNotNull(cell);
    org.junit.Assert.assertEquals(3, cell.getX());
    org.junit.Assert.assertEquals(2, cell.getY());
    org.junit.Assert.assertEquals(cell.isAlive(), false);
}