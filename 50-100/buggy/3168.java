private com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord getIdentityIssuerDataRecord(java.lang.String assetPublicKey, java.lang.String publicKey, java.lang.String name, java.lang.String signature) throws com.bitdubai.fermat_dap_plugin.layer.middleware.asset.issuer.developer.bitdubai.version_1.exceptions.DatabaseOperationException, com.bitdubai.fermat_dap_plugin.layer.middleware.asset.issuer.developer.bitdubai.version_1.exceptions.MissingAssetDataException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTable databaseTable = getDatabaseTable(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_IDENTITY_ISSUER_TABLE_NAME);
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord record = databaseTable.getEmptyRecord();
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_IDENTITY_ISSUER_ASSET_PUBLIC_KEY_COLUMN, assetPublicKey);
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_IDENTITY_ISSUER_NAME_COLUMN, name);
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_IDENTITY_ISSUER_PUBLIC_KEY_COLUMN, publicKey);
    record.setStringValue(AssertFactoryMiddlewareDatabaseConstant.ASSET_FACTORY_IDENTITY_ISSUER_SIGNATURE_COLUMN, signature);
    return record;
}