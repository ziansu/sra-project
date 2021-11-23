private long getOutgoingTransactionValue(org.bitcoinj.core.Wallet wallet, org.bitcoinj.core.Transaction tx) {
    try {
        return tx.getValue(wallet).getValue();
    } catch (java.lang.Exception e) {
        return 0;
    }
}