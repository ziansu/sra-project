@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithNullList() {
    org.junit.Assert.assertFalse(fact.anyFluxLocationTypeCodeContainsValue(null, "POSITION"));
}