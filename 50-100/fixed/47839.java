public static java.util.List<org.talend.cwm.relational.TdView> getViews(java.sql.Connection sqlConnection, org.talend.core.model.metadata.builder.connection.Connection dataProvider, orgomg.cwm.resource.relational.Catalog catalog, java.lang.String viewPattern, boolean loadFromDB, boolean isPersist2Con) throws java.lang.Exception {
    if (loadFromDB && (!((org.talend.core.model.metadata.builder.database.DqRepositoryViewService.isComeFromRefrenceProject(dataProvider)) && isPersist2Con))) {
        return org.talend.core.model.metadata.builder.database.DqRepositoryViewService.loadViews(sqlConnection, dataProvider, catalog, null, viewPattern, isPersist2Con);
    }else {
        return org.talend.cwm.helper.CatalogHelper.getViews(catalog);
    }
}