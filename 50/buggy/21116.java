private static long getTxExpirationFromWritePointer(long writePointer, long timeoutInSeconds) {
    return (writePointer / (TxConstants.MAX_TX_PER_MS)) + (java.util.concurrent.TimeUnit.SECONDS.toMillis(timeoutInSeconds));
}