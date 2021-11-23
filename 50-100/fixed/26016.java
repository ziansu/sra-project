private void testValuesOfDefaultFeatureStoreInstance(org.dkpro.tc.api.features.FeatureStore fs) {
    assertEquals(2, fs.getNumberOfInstances());
    assertEquals("outcome", fs.getUniqueOutcomes().first());
    assertEquals(new org.dkpro.tc.api.features.Feature("feature1", "value1"), fs.getInstance(0).getFeatures().iterator().next());
}