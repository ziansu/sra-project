@org.junit.Test
public void testInitProperties_emptyBundleService() {
    org.osgi.framework.BundleContext context = org.mockito.Mockito.mock(org.osgi.framework.BundleContext.class);
    namedClusterManager.setBundleContext(context);
    namedClusterManager.initProperties();
    java.util.Map<java.lang.String, java.lang.Object> prop = namedClusterManager.getProperties();
    org.junit.Assert.assertEquals(0, prop.keySet().size());
}