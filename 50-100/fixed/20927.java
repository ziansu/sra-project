private javax.security.jacc.PolicyConfigurationFactory getPolicyConfigurationFactory() throws java.lang.ClassNotFoundException, javax.security.jacc.PolicyContextException, org.jboss.modules.ModuleLoadException {
    java.lang.String module = org.wildfly.security.manager.WildFlySecurityManager.getPropertyPrivileged(org.jboss.as.security.service.SecurityBootstrapService.JACC_MODULE, null);
    final java.lang.ClassLoader originalClassLoader;
    final java.lang.ClassLoader jaccClassLoader;
    if (module != null) {
        jaccClassLoader = org.jboss.as.security.service.SecurityActions.getModuleClassLoader(module);
        originalClassLoader = org.jboss.as.security.service.SecurityActions.setThreadContextClassLoader(jaccClassLoader);
    }else {
        jaccClassLoader = null;
        originalClassLoader = null;
    }
    try {
        return javax.security.jacc.PolicyConfigurationFactory.getPolicyConfigurationFactory();
    } finally {
        if (originalClassLoader != null) {
            org.jboss.as.security.service.SecurityActions.setThreadContextClassLoader(originalClassLoader);
        }
    }
}