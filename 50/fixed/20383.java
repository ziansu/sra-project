@org.junit.Test
public void testIsPositiveShouldReturnFalseWithNegativeValue() {
    assertFalse(fact.isPositive(new java.math.BigDecimal("-10")));
}