@org.junit.Test(expected = java.lang.NullPointerException.class)
public void sortFeaturesWithSectionsNoSetup() throws java.lang.Exception {
    org.phenotips.export.internal.ConversionHelpers helpers = new org.phenotips.export.internal.ConversionHelpers();
    org.phenotips.export.internal.ConversionHelpers helpersSpy = org.mockito.Mockito.spy(helpers);
    java.util.Set<org.phenotips.data.Feature> features = new java.util.HashSet<>();
    helpersSpy.featureSetUp(false);
    org.mockito.Mockito.doReturn(null).when(helpersSpy).getCategoryMapping();
    helpersSpy.sortFeaturesWithSections(features);
}