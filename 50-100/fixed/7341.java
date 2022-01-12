public org.bitcoinj.core.Transaction loadTransactionFromDisk(java.lang.String txHash) throws com.bitdubai.fermat_bch_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.exceptions.CantLoadTransactionFromFileException {
    try {
        com.bitdubai.fermat_api.layer.osa_android.file_system.PluginTextFile pluginTextFile = pluginFileSystem.getTextFile(this.pluginId, TRANSACTION_DIRECTORY, txHash, FilePrivacy.PRIVATE, FileLifeSpan.PERMANENT);
        java.lang.String transactionContent = pluginTextFile.getContent();
        org.bitcoinj.core.Transaction transaction = ((org.bitcoinj.core.Transaction) (com.bitdubai.fermat_api.layer.all_definition.util.XMLParser.parseXML(transactionContent, new org.bitcoinj.core.Transaction(NETWORK_PARAMETERS))));
        return transaction;
    } catch (java.lang.Exception e) {
        throw new com.bitdubai.fermat_bch_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.exceptions.CantLoadTransactionFromFileException(com.bitdubai.fermat_bch_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.exceptions.CantLoadTransactionFromFileException.CONTEXT_CONTENT_SEPARATOR, e, (("Error loading transaction " + txHash) + " from disk."), "IO Error");
    }
}