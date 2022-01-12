@org.junit.Test
public void testValidateFluxLocationsForFaCatchShouldReturnFalseWithNonEmptySpecifiedFLUXLocationsList() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch> faCatchFacts = new java.util.ArrayList<>();
    un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch faCatch = new un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FACatch();
    java.util.ArrayList<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation> fluxLocations = new java.util.ArrayList<>();
    un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation fluxLocation = new un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation();
    fluxLocations.add(fluxLocation);
    faCatch.setSpecifiedFLUXLocations(fluxLocations);
    faCatchFacts.add(faCatch);
    assertFalse(fact.validateFluxLocationsForFaCatch(faCatchFacts));
}