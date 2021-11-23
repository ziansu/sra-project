@java.lang.Override
public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    com.puresoltechnologies.commons.osgi.AbstractActivator.logger.info((("Stopping bundle '" + (context.getBundle().getSymbolicName())) + "'..."));
    if ((this.context) == null) {
        throw new java.lang.RuntimeException("Bundle was not started, yet.");
    }
    this.context = null;
    deregisterServices();
}