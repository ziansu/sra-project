@java.lang.Override
public java.util.Optional<com.yahoo.bard.webservice.table.PhysicalTable> build(com.yahoo.bard.webservice.data.config.ResourceDictionaries dictionaries, com.yahoo.bard.webservice.metadata.DataSourceMetadataService metadataService) {
    return java.util.Optional.of(new com.yahoo.bard.webservice.table.PermissiveConcretePhysicalTable(getName(), getTimeGrain(), buildColumns(dictionaries.getDimensionDictionary()), getLogicalToPhysicalNames(), metadataService));
}