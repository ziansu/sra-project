@org.junit.Test
public void getResourcesShouldReturnResourceWithRootSet() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.Object> config = com.google.common.collect.ImmutableMap.of("metron.apps.hdfs.dir", "./target/resdir/");
    try (org.apache.metron.common.utils.ResourceLoader loader = new org.apache.metron.common.utils.ResourceLoader.Builder().withConfiguration(config).build()) {
        java.util.Map<java.lang.String, java.io.InputStream> resources = loader.getResources("/test1");
        org.junit.Assert.assertNotNull(resources.get("/test1"));
    }
}