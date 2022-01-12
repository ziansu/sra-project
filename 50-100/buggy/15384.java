public static org.hibernate.boot.model.process.spi.ManagedResources prepare(final org.hibernate.boot.MetadataSources sources, final org.hibernate.boot.spi.BootstrapContext bootstrapContext, final org.hibernate.boot.spi.MetadataBuildingOptions options) {
    final org.hibernate.boot.model.process.internal.ManagedResourcesImpl managedResources = org.hibernate.boot.model.process.internal.ManagedResourcesImpl.baseline(sources, bootstrapContext);
    ScanningCoordinator.INSTANCE.coordinateScan(managedResources, options, sources.getXmlMappingBinderAccess());
    return managedResources;
}