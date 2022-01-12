private static org.osgi.framework.Bundle bundleLookupWithInactive(java.lang.String bundleId) {
    org.osgi.framework.Bundle[] bundles = org.eclipse.core.runtime.adaptor.EclipseStarter.getSystemBundleContext().getBundles();
    org.osgi.framework.Bundle result = null;
    org.osgi.framework.Version currVersion = org.osgi.framework.Version.emptyVersion;
    for (org.osgi.framework.Bundle bundle : bundles) {
        if ((bundle.getSymbolicName().equals(bundleId)) && ((bundle.getVersion().compareTo(currVersion)) > 0)) {
            result = bundle;
            currVersion = bundle.getVersion();
        }
    }
    return result;
}