@org.junit.Test
public void getResourcesShouldReturnResourceWithNoRootSetAndExistingFSConfig() throws java.lang.Exception {
    try (org.apache.metron.common.utils.ResourceLoader loader = new org.apache.metron.common.utils.ResourceLoader.Builder().withFileSystemConfiguration(new org.apache.hadoop.conf.Configuration()).build()) {
        java.util.Map<java.lang.String, java.io.InputStream> resources = loader.getResources("target/test");
        org.junit.Assert.assertNotNull(resources.get("target/test"));
    }
}