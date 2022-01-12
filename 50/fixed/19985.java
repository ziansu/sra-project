@org.junit.Test
public void testParse() {
    assertEquals(KILO(tec.uom.se.unit.Units.GRAM), tec.uom.se.AbstractUnit.parse("kg"));
}