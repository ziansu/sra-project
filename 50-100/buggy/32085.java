@java.lang.Override
public java.util.List<com.bitdubai.fermat_api.layer.all_definition.developer.DeveloperDatabaseTableRecord> getDatabaseTableContent(com.bitdubai.fermat_api.layer.all_definition.developer.DeveloperObjectFactory developerObjectFactory, com.bitdubai.fermat_api.layer.all_definition.developer.DeveloperDatabase developerDatabase, com.bitdubai.fermat_api.layer.all_definition.developer.DeveloperDatabaseTable developerDatabaseTable) {
    com.bitdubai.fermat_cer_plugin.layer.provider.dolartoday.developer.bitdubai.version_1.database.DolarTodayProviderDeveloperDatabaseFactory factory = new com.bitdubai.fermat_cer_plugin.layer.provider.dolartoday.developer.bitdubai.version_1.database.DolarTodayProviderDeveloperDatabaseFactory(pluginDatabaseSystem, pluginId);
    java.util.List<com.bitdubai.fermat_api.layer.all_definition.developer.DeveloperDatabaseTableRecord> tableRecordList = null;
    try {
        factory.initializeDatabase();
        tableRecordList = factory.getDatabaseTableContent(developerObjectFactory, developerDatabaseTable);
    } catch (com.bitdubai.fermat_cer_plugin.layer.provider.dolartoday.developer.bitdubai.version_1.exceptions.CantInitializeDolarTodayProviderDatabaseException cantInitializeException) {
        com.bitdubai.fermat_api.FermatException e = new com.bitdubai.fermat_cer_plugin.layer.provider.dolartoday.developer.bitdubai.version_1.exceptions.CantDeliverDatabaseException("Database cannot be initialized", cantInitializeException, "ProviderDolartodayPluginRoot", null);
        errorManager.reportUnexpectedPluginException(Plugins.BITDUBAI_CER_PROVIDER_DOLARTODAY, UnexpectedPluginExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_PLUGIN, e);
    }
    return tableRecordList;
}