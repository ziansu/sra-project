@org.junit.Test
public void test() throws java.lang.Exception {
    final org.apache.kylin.metadata.realization.RealizationRegistry registry = org.apache.kylin.metadata.realization.RealizationRegistry.getInstance(org.apache.kylin.common.KylinConfig.getInstanceFromEnv());
    final java.util.Set<org.apache.kylin.metadata.realization.RealizationType> realizationTypes = registry.getRealizationTypes();
    org.junit.Assert.assertEquals(org.apache.kylin.metadata.realization.RealizationType.values().length, realizationTypes.size());
    for (org.apache.kylin.metadata.realization.RealizationType type : org.apache.kylin.metadata.realization.RealizationType.values()) {
        org.junit.Assert.assertTrue(realizationTypes.contains(type));
    }
}