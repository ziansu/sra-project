public void testDescriptor() throws java.lang.Exception {
    org.datacleaner.descriptors.AnalyzerDescriptor<?> desc = org.datacleaner.descriptors.Descriptors.ofAnalyzer(org.datacleaner.beans.valuedist.ValueDistributionAnalyzer.class);
    assertEquals(0, desc.getInitializeMethods().size());
    assertEquals(6, desc.getConfiguredProperties().size());
    assertEquals(2, desc.getProvidedProperties().size());
    assertEquals("Value distribution", desc.getDisplayName());
}