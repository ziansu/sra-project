@org.junit.Test
public void testIsPositiveShouldReturnTrueWithPositiveValue() {
    assertTrue(fact.isPositive(new java.math.BigDecimal("10")));
}