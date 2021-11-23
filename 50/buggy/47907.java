@org.junit.Test
public void testIsInRangeSad() {
    org.junit.Assert.assertTrue(fact.isInRange(new java.math.BigDecimal("-10"), (-10), 200));
}