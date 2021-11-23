@org.junit.Test
public void testInitProperties_emptyBundleService() {
    org.osgi.framework.BundleContext context = mock(org.osgi.framework.BundleContext.class);
    namedClusterManager.setBundleContext(context);
    namedClusterManager.initProperties();
    java.util.Map<java.lang.String, java.lang.Object> prop = namedClusterManager.getProperties();
    assertEquals(0, prop.keySet().size());
}