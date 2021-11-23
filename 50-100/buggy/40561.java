@org.junit.Test
public void testValidateFluxLocationsForFaCatchShouldReturnTrueWithEmptySpecifiedFLUXLocationsList() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch> faCatchFacts = new java.util.ArrayList<>();
    un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch faCatch = new un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch();
    faCatch.setSpecifiedFLUXLocations(new java.util.ArrayList<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation>());
    faCatchFacts.add(faCatch);
    org.junit.Assert.assertTrue(fact.validateFluxLocationsForFaCatch(faCatchFacts));
}