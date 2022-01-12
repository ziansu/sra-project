@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    com.puresoltechnologies.commons.osgi.AbstractActivator.logger.info((("Starting bundle '" + (context.getBundle().getSymbolicName())) + "'..."));
    if ((this.context) != null) {
        throw new java.lang.RuntimeException("Bundle was already started.");
    }
    this.context = context;
}