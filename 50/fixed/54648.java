@org.junit.Test
public void testGetComparablePiShort() {
    java.math.BigDecimal piBigDecimal = new java.math.BigDecimal("3.141").setScale(3, java.math.BigDecimal.ROUND_HALF_UP);
    java.lang.String piString = "3.141";
    org.junit.Assert.assertEquals(piString, piDisplay.getComparablePi(piBigDecimal));
}