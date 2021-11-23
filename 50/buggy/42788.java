@org.junit.Test
public void testNumberOfDecimalsHappy() {
    org.junit.Assert.assertEquals(4, fact.numberOfDecimals(new java.math.BigDecimal("10.3902")));
}