private void setErrorHandler() {
    if ((errorHandler) == null) {
        org.osgi.framework.Bundle bundle = org.osgi.framework.FrameworkUtil.getBundle(org.codice.ddf.platform.error.servlet.ErrorServlet.class);
        if (bundle != null) {
            org.osgi.framework.BundleContext bundleContext = bundle.getBundleContext();
            if (bundleContext != null) {
                org.osgi.framework.ServiceReference<org.codice.ddf.platform.error.handler.ErrorHandler> serviceReference = bundleContext.getServiceReference(org.codice.ddf.platform.error.handler.ErrorHandler.class);
                if (serviceReference != null) {
                    errorHandler = bundleContext.getService(serviceReference);
                }
            }
        }
    }
}