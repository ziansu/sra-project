@org.junit.Test
public void testInitProperties_exceptionDuringLoadService() {
    org.osgi.framework.ServiceReference reference = org.mockito.Mockito.mock(org.osgi.framework.ServiceReference.class);
    org.osgi.framework.BundleContext context = org.mockito.Mockito.mock(org.osgi.framework.BundleContext.class);
    org.mockito.Mockito.when(context.getServiceReference(org.mockito.Matchers.anyString())).thenReturn(reference);
    namedClusterManager.setBundleContext(context);
    namedClusterManager.initProperties();
    java.util.Map<java.lang.String, java.lang.Object> prop = namedClusterManager.getProperties();
    org.junit.Assert.assertEquals(0, prop.keySet().size());
}