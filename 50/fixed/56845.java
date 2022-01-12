private com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord constructBalanceRecord(final long availableRunningBalance, final long bookRunningBalance) throws com.bitdubai.fermat_ccp_plugin.layer.basic_wallet.bitcoin_wallet.developer.bitdubai.version_1.exceptions.CantGetBalanceRecordException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord record = getBalancesRecord();
    record.setLongValue(BitcoinWalletDatabaseConstants.BITCOIN_WALLET_BALANCE_TABLE_AVAILABLE_BALANCE_COLUMN_NAME, availableRunningBalance);
    record.setLongValue(BitcoinWalletDatabaseConstants.BITCOIN_WALLET_BALANCE_TABLE_BOOK_BALANCE_COLUMN_NAME, bookRunningBalance);
    return record;
}