public static org.osgi.framework.Bundle getJRebelBundle() {
    org.osgi.framework.Bundle bundle = null;
    try {
        bundle = org.eclipse.core.runtime.Platform.getBundle("org.zeroturnaround.eclipse");
        if (bundle == null) {
            bundle = org.eclipse.core.runtime.Platform.getBundle("org.zeroturnaround.eclipse.remoting");
        }
    } catch (java.lang.Throwable e) {
        org.eclipse.cft.server.core.internal.CloudFoundryPlugin.logError(e);
    }
    return bundle;
}