@java.lang.SuppressWarnings(value = "restriction")
public static boolean isEclipseDebug() {
    boolean debuggerEnabled = false;
    org.osgi.framework.BundleContext bundleContext = org.osgi.framework.FrameworkUtil.getBundle(org.talend.commons.runtime.debug.TalendDebugHandler.class).getBundleContext();
    if (bundleContext == null) {
        return false;
    }
    org.osgi.framework.ServiceReference<org.eclipse.osgi.service.debug.DebugOptions> debugOptSR = bundleContext.getServiceReference(org.eclipse.osgi.service.debug.DebugOptions.class);
    if (debugOptSR != null) {
        org.eclipse.osgi.service.debug.DebugOptions debugOpt = bundleContext.getService(debugOptSR);
        debuggerEnabled = debugOpt.isDebugEnabled();
    }
    return debuggerEnabled;
}