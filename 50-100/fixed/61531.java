private NetconfDevice.SchemaResourcesDTO createSchemaResourcesDTO(final java.lang.String moduleSchemaCacheDirectory, final java.lang.String instanceName) {
    final org.opendaylight.yangtools.yang.parser.repo.SharedSchemaRepository repository = new org.opendaylight.yangtools.yang.parser.repo.SharedSchemaRepository(moduleSchemaCacheDirectory);
    final org.opendaylight.yangtools.yang.model.repo.api.SchemaContextFactory schemaContextFactory = repository.createSchemaContextFactory(SchemaSourceFilter.ALWAYS_ACCEPT);
    setSchemaRegistry(repository);
    setSchemaContextFactory(schemaContextFactory);
    final org.opendaylight.yangtools.yang.model.repo.util.FilesystemSchemaSourceCache<org.opendaylight.yangtools.yang.model.repo.api.YangTextSchemaSource> deviceCache = createDeviceFilesystemCache(moduleSchemaCacheDirectory);
    repository.registerSchemaSourceListener(deviceCache);
    return new org.opendaylight.netconf.sal.connect.netconf.NetconfDevice.SchemaResourcesDTO(repository, schemaContextFactory, new org.opendaylight.netconf.sal.connect.netconf.NetconfStateSchemas.NetconfStateSchemasResolverImpl());
}