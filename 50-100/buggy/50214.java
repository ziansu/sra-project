public com.stratio.crossdata.common.data.CatalogName createTestCatalog(java.lang.String name) {
    com.stratio.crossdata.common.data.CatalogName catalogName = new com.stratio.crossdata.common.data.CatalogName(name);
    java.util.Map<com.stratio.crossdata.common.data.TableName, com.stratio.crossdata.common.metadata.TableMetadata> catalogTables = new java.util.HashMap<>();
    java.util.Map<com.stratio.crossdata.common.statements.structures.Selector, com.stratio.crossdata.common.statements.structures.Selector> options = new java.util.HashMap<>();
    com.stratio.crossdata.common.metadata.CatalogMetadata catalogMetadata = new com.stratio.crossdata.common.metadata.CatalogMetadata(catalogName, options, catalogTables);
    MetadataManager.MANAGER.createCatalog(catalogMetadata, false);
    return catalogName;
}