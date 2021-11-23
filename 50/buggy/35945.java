public void nonDefaultMountsDetected(org.osgi.framework.BundleContext bundleContext) {
    serviceRegistration = bundleContext.registerService(org.apache.jackrabbit.oak.plugins.commit.CrossStoreReferencesValidatorProvider.class.getName(), this, null);
}