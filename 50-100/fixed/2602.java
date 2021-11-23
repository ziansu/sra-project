public static void toWriter(org.hibernate.boot.Metadata metadata, java.io.Writer writer) {
    final org.hibernate.service.ServiceRegistry serviceRegistry = ((org.hibernate.boot.spi.MetadataImplementor) (metadata)).getMetadataBuildingOptions().getServiceRegistry();
    final java.util.Map settings = serviceRegistry.getService(org.hibernate.engine.config.spi.ConfigurationService.class).getSettings();
    settings.put(AvailableSettings.HBM2DDL_SCRIPTS_ACTION, Action.CREATE);
    settings.put(AvailableSettings.HBM2DDL_SCRIPTS_CREATE_TARGET, writer);
    org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(((org.hibernate.boot.spi.MetadataImplementor) (metadata)), serviceRegistry, settings, DelayedDropRegistryNotAvailableImpl.INSTANCE);
}