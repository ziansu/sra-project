private void testValuesOfDefaultFeatureStoreInstance(org.dkpro.tc.api.features.FeatureStore fs) {
    org.junit.Assert.assertEquals(2, fs.getNumberOfInstances());
    org.junit.Assert.assertEquals("outcome", fs.getUniqueOutcomes().first());
    org.junit.Assert.assertEquals(new org.dkpro.tc.api.features.Feature("feature1", "value1"), fs.getInstance(0).getFeatures().iterator().next());
}