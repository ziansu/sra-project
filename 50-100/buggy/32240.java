public com.bitdubai.fermat_dap_api.layer.all_definition.enums.TransactionStatus getDigitalAssetTransactionStatus(java.lang.String transactionId) throws com.bitdubai.fermat_dap_api.layer.dap_transaction.common.exceptions.UnexpectedResultReturnedFromDatabaseException, com.bitdubai.fermat_dap_plugin.layer.digital_asset_transaction.asset_issuing.developer.bitdubai.version_1.exceptions.CantCheckAssetIssuingProgressException {
    try {
        java.lang.String transactionStatusCode = getStringFieldFromAssetIssuingTableById(transactionId, AssetIssuingTransactionDatabaseConstants.DIGITAL_ASSET_TRANSACTION_ASSET_ISSUING_TRANSACTION_STATE_COLUMN_NAME);
        return com.bitdubai.fermat_dap_api.layer.all_definition.enums.TransactionStatus.getByCode(transactionStatusCode);
    } catch (com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException exception) {
        this.database.closeDatabase();
        throw new com.bitdubai.fermat_dap_plugin.layer.digital_asset_transaction.asset_issuing.developer.bitdubai.version_1.exceptions.CantCheckAssetIssuingProgressException(com.bitdubai.fermat_api.FermatException.wrapException(exception), "Checking Transaction Status", "Unexpected exception");
    }
}