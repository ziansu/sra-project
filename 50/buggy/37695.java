void removeFrameworkListeners(final org.jboss.osgi.framework.internal.AbstractBundleState bundleState) {
    synchronized(frameworkListeners) {
        frameworkListeners.remove(bundleState);
    }
}