@java.lang.Override
public liquibase.CatalogAndSchema getSchemaFromJdbcInfo(java.lang.String rawCatalogName, java.lang.String rawSchemaName) {
    if ((rawCatalogName != null) && (rawSchemaName == null)) {
        rawSchemaName = rawCatalogName;
    }
    return new liquibase.CatalogAndSchema(rawSchemaName, null).customize(this);
}