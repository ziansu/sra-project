@org.junit.Test
public void testToString() {
    assertEquals("kg", KILO(UCUM.GRAM).toString());
    assertEquals("lb", UCUM.POUND.toString());
    assertEquals("oz", UCUM.OUNCE.toString());
    assertEquals("g", UCUM.GRAM.toString());
    assertEquals("lb", UCUM.POUND.toString());
}