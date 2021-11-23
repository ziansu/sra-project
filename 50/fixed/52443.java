@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithEmptyList() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation> fluxLocations = new java.util.ArrayList<>();
    assertFalse(fact.anyFluxLocationTypeCodeContainsValue(fluxLocations, "POSITION"));
}