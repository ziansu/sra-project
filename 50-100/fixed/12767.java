private static void testServerChannelFactory(org.osgi.framework.BundleContext bundleContext) {
    org.osgi.framework.ServiceReference<com.wincom.dcim.agentd.NetworkService> serviceRef = bundleContext.getServiceReference(com.wincom.dcim.agentd.NetworkService.class);
    com.wincom.dcim.agentd.NetworkService service = bundleContext.getService(serviceRef);
    java.lang.System.out.println(serviceRef);
    java.lang.System.out.println(service);
    com.wincom.dcim.agentd.internal.AgentdServiceActivator.createAcceptor(service);
    for (int i = 0; i < 1; ++i) {
        com.wincom.dcim.agentd.internal.AgentdServiceActivator.createConnection(service);
    }
}