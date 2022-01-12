void removeServiceListeners(final org.jboss.osgi.framework.internal.AbstractBundleState bundleState) {
    java.util.Collection<org.osgi.framework.hooks.service.ListenerHook.ListenerInfo> listenerInfos = getServiceListenerInfos(bundleState);
    serviceListeners.remove(bundleState);
    for (org.osgi.framework.hooks.service.ListenerHook hook : getServiceListenerHooks()) {
        try {
            hook.removed(listenerInfos);
        } catch (java.lang.RuntimeException ex) {
            log.errorf(ex, "Error processing ListenerHook: %s", hook);
        }
    }
}