protected synchronized void start(org.osgi.service.component.ComponentContext ctx) {
    super.start();
    this.componentContext = ctx;
    java.util.Dictionary serviceProps = new java.util.Hashtable();
    serviceProps.put(Constants.SERVICE_PID, getServicePID());
    this.componentContext.getBundleContext().registerService(org.osgi.service.cm.ManagedService.class, this, serviceProps);
}