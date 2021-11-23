@java.lang.Override
public java.lang.Object createContextualProxy(final java.lang.Object instance, final java.util.Map<java.lang.String, java.lang.String> executionProperties, final java.lang.Class<?>... interfaces) {
    if (org.wildfly.security.manager.WildFlySecurityManager.isChecking()) {
        return java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Object>() {
            @java.lang.Override
            public java.lang.Object run() {
                return internalCreateContextualProxy(instance, executionProperties, interfaces);
            }
        });
    }else {
        return internalCreateContextualProxy(instance, executionProperties, interfaces);
    }
}