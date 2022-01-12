public static java.util.List<org.talend.cwm.relational.TdTable> getTables(java.sql.Connection sqlConnection, org.talend.core.model.metadata.builder.connection.Connection dataProvider, orgomg.cwm.resource.relational.Schema schema, java.lang.String tablePattern, boolean loadFromDB, boolean isPersist2Con) throws java.lang.Exception {
    if (loadFromDB && (!((org.talend.core.model.metadata.builder.database.DqRepositoryViewService.isComeFromRefrenceProject(dataProvider)) && isPersist2Con))) {
        final orgomg.cwm.resource.relational.Catalog parentCatalog = org.talend.cwm.helper.CatalogHelper.getParentCatalog(schema);
        return org.talend.core.model.metadata.builder.database.DqRepositoryViewService.loadTables(sqlConnection, dataProvider, parentCatalog, schema, tablePattern, isPersist2Con);
    }else {
        return org.talend.cwm.helper.SchemaHelper.getTables(schema);
    }
}