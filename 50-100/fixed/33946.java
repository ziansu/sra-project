private synchronized void close(boolean checkForStaleScan) {
    if ((status) != (io.fluo.core.impl.TransactionImpl.TxStatus.CLOSED)) {
        status = io.fluo.core.impl.TransactionImpl.TxStatus.CLOSED;
        if (checkForStaleScan && (!(commitAttempted))) {
            io.fluo.core.oracle.Stamp stamp = env.getSharedResources().getOracleClient().getStamp();
            if ((startTs) < (stamp.getGcTimestamp())) {
                throw new io.fluo.core.exceptions.StaleScanException();
            }
        }
        env.getSharedResources().getTimestampTracker().removeTimestamp(startTs);
    }
}