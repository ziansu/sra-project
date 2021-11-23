@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithWrongValue() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation> fluxLocations = eu.europa.ec.fisheries.uvms.rules.service.bean.RuleTestHelper.createFluxLocationsWithPositionValue();
    org.junit.Assert.assertFalse(fact.anyFluxLocationTypeCodeContainsValue(fluxLocations, "ARG4376mn.l"));
}