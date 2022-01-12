public void nonDefaultMountsDetected(org.osgi.framework.BundleContext bundleContext) {
    if ((serviceRegistration) == null) {
        serviceRegistration = bundleContext.registerService(org.apache.jackrabbit.oak.plugins.commit.CrossStoreReferencesValidatorProvider.class.getName(), this, null);
    }
}