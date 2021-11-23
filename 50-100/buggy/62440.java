public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    java.util.Iterator<org.osgi.framework.ServiceRegistration> iterator = regs.iterator();
    while (iterator.hasNext()) {
        org.osgi.framework.ServiceRegistration reg = iterator.next();
        reg.unregister();
        iterator.remove();
    } 
    stopShell();
    this.commandProcessorTracker.close();
}