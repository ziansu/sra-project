public com.bitdubai.fermat_dap_plugin.layer.digital_asset_transaction.asset_seller.developer.bitdubai.version_1.structure.functional.SellingRecord getLastSellingRecord(java.util.UUID negotiationId) throws com.bitdubai.fermat_dap_api.layer.all_definition.exceptions.DAPException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableFilter referenceFilter = constructEqualFilter(AssetSellerDatabaseConstants.ASSET_SELLER_NEGOTIATION_REFERENCE_COLUMN_NAME, negotiationId.toString());
    try {
        return constructSellingRecordList(getRecordsByFilterSellerTable(referenceFilter)).get(0);
    } catch (com.bitdubai.fermat_dap_api.layer.dap_wallet.common.exceptions.CantLoadWalletException | com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantLoadTableToMemoryException | com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException e) {
        throw new com.bitdubai.fermat_dap_api.layer.all_definition.exceptions.DAPException(e);
    }
}