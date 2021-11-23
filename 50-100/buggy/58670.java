private <T> T getService(java.lang.Class<T> service) {
    org.osgi.framework.BundleContext context = org.osgi.framework.FrameworkUtil.getBundle(getClass()).getBundleContext();
    org.osgi.framework.ServiceReference<T> ref = context.getServiceReference(service);
    return ref != null ? context.getService(ref) : null;
}