public java.util.List<org.bitcoinj.core.TransactionOutput> getUnspentInstantOutputs() {
    java.util.List<org.bitcoinj.core.TransactionOutput> unspentInstantOutputs = new java.util.ArrayList<org.bitcoinj.core.TransactionOutput>();
    for (org.bitcoinj.core.TransactionOutput unspentTransactionOutput : kit.wallet().calculateAllSpendCandidates(false, false)) {
        if (unspentTransactionOutput.getScriptPubKey().getToAddress(Constants.PARAMS).equals(this.getCurrentReceiveAddress())) {
            unspentInstantOutputs.add(unspentTransactionOutput);
        }
    }
    return unspentInstantOutputs;
}