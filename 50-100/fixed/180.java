private java.util.List<com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord> getRecordsByFilterNegotiationTable(com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableFilter... filters) throws com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantLoadTableToMemoryException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTable table = getNegotiationTable();
    for (com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableFilter filter : filters) {
        table.addStringFilter(filter.getColumn(), filter.getValue(), filter.getType());
    }
    table.addFilterOrder(AssetSellerDatabaseConstants.ASSET_SELLER_NEGOTIATION_TIMESTAMP_COLUMN_NAME, DatabaseFilterOrder.ASCENDING);
    table.loadToMemory();
    return table.getRecords();
}