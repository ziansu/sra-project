@org.junit.Test
public void testIsPositiveShouldReturnFalseWithNegativeValue() {
    org.junit.Assert.assertFalse(fact.isPositive(new java.math.BigDecimal("-10")));
}