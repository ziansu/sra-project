@org.junit.Test
public void testValidateDelimitedPeriodShouldReturnTrueWhenNull() {
    assertTrue(fact.validateDelimitedPeriod(null, true, false));
}