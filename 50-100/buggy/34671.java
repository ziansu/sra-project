private javax.servlet.Servlet getImpl() {
    if ((impl) == null) {
        try {
            javax.servlet.ServletRequest.class.getMethod("startAsync");
            impl = new org.eclipse.smarthome.ui.internal.proxy.AsyncProxyServlet(this);
        } catch (java.lang.Exception e) {
            impl = new org.eclipse.smarthome.ui.internal.proxy.BlockingProxyServlet(this);
        }
    }
    return impl;
}