public org.jboss.as.naming.ManagedReference createInstance(java.util.Map<java.lang.Object, java.lang.Object> contextData) throws java.lang.Exception {
    final java.lang.ClassLoader oldTCCL = org.wildfly.security.manager.WildFlySecurityManager.getCurrentContextClassLoaderPrivileged();
    try {
        org.wildfly.security.manager.WildFlySecurityManager.setCurrentContextClassLoaderPrivileged(component.getComponentClass());
        return viewInstanceFactory.createViewInstance(this, contextData);
    } finally {
        org.wildfly.security.manager.WildFlySecurityManager.setCurrentContextClassLoaderPrivileged(oldTCCL);
    }
}