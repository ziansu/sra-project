public static final org.osgi.framework.BundleContext getBundleContext() {
    if ((com.puresoltechnologies.commons.osgi.AbstractActivator.context) == null) {
        throw new java.lang.RuntimeException("Bundle was not activated, yet.");
    }
    return com.puresoltechnologies.commons.osgi.AbstractActivator.context;
}