@org.junit.Test
public void testIsInRangeSad() {
    assertTrue(fact.isInRange(new java.math.BigDecimal("-10"), (-10), 200));
}