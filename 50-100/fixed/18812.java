public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.eclipse.equinox.http.servlet.internal.servlet.ServletContext)) {
        return false;
    }
    if (!(java.lang.reflect.Proxy.isProxyClass(obj.getClass()))) {
        return false;
    }
    java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
    if (!(invocationHandler instanceof org.eclipse.equinox.http.servlet.internal.servlet.ServletContextAdaptor.AdaptorInvocationHandler)) {
        return false;
    }
    org.eclipse.equinox.http.servlet.internal.servlet.ServletContextAdaptor.AdaptorInvocationHandler adaptorInvocationHandler = ((org.eclipse.equinox.http.servlet.internal.servlet.ServletContextAdaptor.AdaptorInvocationHandler) (invocationHandler));
    return contextController.equals(adaptorInvocationHandler.getContextController());
}