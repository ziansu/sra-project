@org.junit.Test
public void testInitProperties_exceptionDuringLoadService() {
    org.osgi.framework.ServiceReference reference = mock(org.osgi.framework.ServiceReference.class);
    org.osgi.framework.BundleContext context = mock(org.osgi.framework.BundleContext.class);
    when(context.getServiceReference(org.mockito.Matchers.anyString())).thenReturn(reference);
    namedClusterManager.setBundleContext(context);
    namedClusterManager.initProperties();
    java.util.Map<java.lang.String, java.lang.Object> prop = namedClusterManager.getProperties();
    assertEquals(0, prop.keySet().size());
}