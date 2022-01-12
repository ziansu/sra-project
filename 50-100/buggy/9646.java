void removeBundleListener(final org.jboss.osgi.framework.internal.AbstractBundleState bundleState, final org.osgi.framework.BundleListener listener) {
    if (listener == null)
        throw new java.lang.IllegalArgumentException("Null listener");
    
    synchronized(bundleListeners) {
        java.util.List<org.osgi.framework.BundleListener> listeners = bundleListeners.get(bundleState);
        if (listeners != null) {
            if ((listeners.size()) > 1)
                listeners.remove(listener);
            else
                removeBundleListeners(bundleState);
            
        }
    }
}