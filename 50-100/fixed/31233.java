@org.junit.Test
public void testGetSymbol() {
    assertEquals("kg", Units.KILOGRAM.getSymbol());
    assertEquals("kg", KILO(UCUM.GRAM).getSymbol());
    assertEquals("kg", Units.GRAM.getSymbol());
    assertEquals("kg", UCUM.OUNCE.getSymbol());
}