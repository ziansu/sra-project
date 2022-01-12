@java.lang.Override
public com.yahoo.bard.webservice.table.PhysicalTable build(com.yahoo.bard.webservice.data.config.ResourceDictionaries dictionaries, com.yahoo.bard.webservice.metadata.DataSourceMetadataService metadataService) {
    return new com.yahoo.bard.webservice.table.PermissiveConcretePhysicalTable(getName(), getTimeGrain(), buildColumns(dictionaries.getDimensionDictionary()), getLogicalToPhysicalNames(), metadataService);
}