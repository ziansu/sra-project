private boolean isTransactionToBeNotified(com.bitdubai.fermat_api.layer.all_definition.transaction_transference_protocol.crypto_transactions.CryptoStatus cryptoStatus) throws com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantExecuteQueryException {
    return assetReceptionDao.isPendingTransactions(cryptoStatus);
}