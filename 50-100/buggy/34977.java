@org.junit.Test
public void testAddAndRemoveColumn() {
    sheet.parseInput("clear");
    sheet.parseInput("addc");
    sheet.parseInput("h1 = 12");
    assertEquals("12", sheet.getCell("H1"));
    sheet.parseInput("removec");
    assertEquals(checkException("H1"), false);
}