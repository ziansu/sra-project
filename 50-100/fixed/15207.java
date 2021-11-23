org.bitcoinj.core.Coin getTxBalance(java.lang.Iterable<org.bitcoinj.core.Transaction> txs, boolean toMe) {
    lock.lock();
    try {
        org.bitcoinj.core.Coin value = org.bitcoinj.core.Coin.ZERO;
        for (org.bitcoinj.core.Transaction tx : txs) {
            if (toMe) {
                value = value.add(tx.getValueSentToMe(this, false));
            }else {
                value = value.add(tx.getValue(this));
            }
        }
        return value;
    } finally {
        lock.unlock();
    }
}