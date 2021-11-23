private void fakeRegisteredServiceEventForExistingServices(final org.osgi.framework.BundleContext bundleContext, org.osgi.framework.ServiceListener sl, java.lang.String filter) throws org.osgi.framework.InvalidSyntaxException {
    org.osgi.framework.ServiceReference<?>[] servicesPresent = bundleContext.getServiceReferences(((java.lang.String) (null)), filter);
    if (servicesPresent != null) {
        for (org.osgi.framework.ServiceReference<?> serviceReference : servicesPresent) {
            sl.serviceChanged(new org.osgi.framework.ServiceEvent(org.osgi.framework.ServiceEvent.REGISTERED, serviceReference));
        }
    }
}