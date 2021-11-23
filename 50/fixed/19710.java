public void stop(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    if ((serviceListener) != null) {
        bundleContext.removeServiceListener(serviceListener);
    }
    this.bundleContext = null;
    serviceListener = null;
    initialized = false;
}