public org.bitcoinj.core.Transaction getBitcoinTransaction(com.bitdubai.fermat_api.layer.all_definition.enums.BlockchainNetworkType blockchainNetworkType, java.lang.String transactionHash) {
    org.bitcoinj.core.Sha256Hash sha256Hash = org.bitcoinj.core.Sha256Hash.wrap(transactionHash);
    org.bitcoinj.core.Transaction transaction = runningAgents.get(blockchainNetworkType).getBitcoinTransaction(sha256Hash);
    if (transaction == null) {
        org.bitcoinj.core.Wallet wallet = getWallet(blockchainNetworkType, null);
        transaction = wallet.getTransaction(sha256Hash);
    }
    return transaction;
}