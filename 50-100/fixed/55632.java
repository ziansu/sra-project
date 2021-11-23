@org.junit.Test
public void featureSetUpNoCategories() throws java.lang.Exception {
    org.phenotips.export.internal.ConversionHelpers helpers = new org.phenotips.export.internal.ConversionHelpers();
    org.phenotips.export.internal.ConversionHelpers helpersSpy = org.mockito.Mockito.spy(helpers);
    helpersSpy.featureSetUp(false);
    org.mockito.Mockito.verify(helpersSpy, org.mockito.Mockito.atMost(0)).getComponentManager();
}