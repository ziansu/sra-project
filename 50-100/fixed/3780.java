protected void processUTXOMessage(org.bitcoinj.core.UTXOsMessage m) {
    com.google.common.util.concurrent.SettableFuture<org.bitcoinj.core.UTXOsMessage> future = null;
    lock.lock();
    try {
        if ((getutxoFutures) != null)
            future = getutxoFutures.pollFirst();
        
    } finally {
        lock.unlock();
    }
    if (future != null)
        future.set(m);
    
}