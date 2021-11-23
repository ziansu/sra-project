@java.lang.Override
public <T> T createContextualProxy(final T instance, final java.util.Map<java.lang.String, java.lang.String> executionProperties, final java.lang.Class<T> intf) {
    if (org.wildfly.security.manager.WildFlySecurityManager.isChecking()) {
        return java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<T>() {
            @java.lang.Override
            public T run() {
                return internalCreateContextualProxy(instance, executionProperties, intf);
            }
        });
    }else {
        return internalCreateContextualProxy(instance, executionProperties, intf);
    }
}