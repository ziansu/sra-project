private boolean isDuplicateTransaction(java.util.UUID trxId) throws com.bitdubai.fermat_bch_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.exceptions.CantExecuteDatabaseOperationException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTable databaseTable = database.getTable(BitcoinCryptoNetworkDatabaseConstants.TRANSACTIONS_TABLE_NAME);
    databaseTable.addUUIDFilter(BitcoinCryptoNetworkDatabaseConstants.TRANSACTIONS_TRX_ID_COLUMN_NAME, trxId, DatabaseFilterType.EQUAL);
    try {
        databaseTable.loadToMemory();
    } catch (com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantLoadTableToMemoryException e) {
        throwLoadToMemoryException(e, databaseTable.getTableName());
    }
    return databaseTable.getRecords().isEmpty();
}