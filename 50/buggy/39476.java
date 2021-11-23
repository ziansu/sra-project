@org.junit.Test
public void testIsPositiveShouldReturnTrueWithPositiveValue() {
    org.junit.Assert.assertTrue(fact.isPositive(new java.math.BigDecimal("10")));
}