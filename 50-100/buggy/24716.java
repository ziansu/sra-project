void addFrameworkListener(final org.jboss.osgi.framework.internal.AbstractBundleState bundleState, final org.osgi.framework.FrameworkListener listener) {
    if (listener == null)
        throw new java.lang.IllegalArgumentException("Null listener");
    
    synchronized(frameworkListeners) {
        java.util.List<org.osgi.framework.FrameworkListener> listeners = frameworkListeners.get(bundleState);
        if (listeners == null) {
            listeners = new java.util.concurrent.CopyOnWriteArrayList<org.osgi.framework.FrameworkListener>();
            frameworkListeners.put(bundleState, listeners);
        }
        if ((listeners.contains(listener)) == false)
            listeners.add(listener);
        
    }
}