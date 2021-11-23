@org.testng.annotations.Test
public void testToDecimaPointNoScaleNoPrecisionReturnsDecimal() {
    java.lang.String text = "23.44444444";
    org.apache.sqoop.schema.type.Decimal col = new org.apache.sqoop.schema.type.Decimal("dd", null, null);
    assertTrue(((toDecimal(text, col)) instanceof java.math.BigDecimal));
    java.math.BigDecimal bd = ((java.math.BigDecimal) (toDecimal(text, col)));
    assertEquals("23.44444444", toCSVDecimal(bd));
}