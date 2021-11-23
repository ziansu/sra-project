private com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord getContractDataRecord(java.lang.String assetPublicKey, java.lang.String name, java.lang.String value) throws com.bitdubai.fermat_dap_plugin.layer.middleware.asset.issuer.developer.bitdubai.version_1.exceptions.DatabaseOperationException, com.bitdubai.fermat_dap_plugin.layer.middleware.asset.issuer.developer.bitdubai.version_1.exceptions.MissingAssetDataException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTable databaseTable = getDatabaseTable(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_CONTRACT_TABLE_NAME);
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord record = databaseTable.getEmptyRecord();
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_CONTRACT_ASSET_PUBLIC_KEY_COLUMN, assetPublicKey);
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_CONTRACT_NAME_COLUMN, name);
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_CONTRACT_VALUE_COLUMN, value);
    return record;
}