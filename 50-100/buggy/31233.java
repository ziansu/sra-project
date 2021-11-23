@org.junit.Test
public void testGetSymbol() {
    assertEquals("kg", Units.KILOGRAM.getSymbol());
    assertEquals("kg", tec.uom.se.unit.MetricPrefix.KILO(UCUM.GRAM).getSymbol());
    assertEquals("kg", Units.GRAM.getSymbol());
    assertEquals("kg", UCUM.OUNCE.getSymbol());
}