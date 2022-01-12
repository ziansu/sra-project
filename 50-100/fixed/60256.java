@java.lang.SuppressWarnings(value = "unchecked")
public void start(final org.osgi.framework.BundleContext bundleContext) {
    this.bundleContext = bundleContext;
    java.util.Dictionary<java.lang.String, java.lang.Object> props = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    props.put(Constants.SERVICE_PID, org.apache.felix.scr.impl.config.ScrConfiguration.PID);
    props.put(Constants.SERVICE_DESCRIPTION, "SCR Configurator");
    props.put(Constants.SERVICE_VENDOR, "The Apache Software Foundation");
    configure(null, false);
    managedService = ((org.osgi.framework.ServiceRegistration<org.osgi.service.cm.ManagedService>) (bundleContext.registerService("org.osgi.service.cm.ManagedService", new org.apache.felix.scr.impl.config.ScrManagedServiceServiceFactory(this), props)));
}