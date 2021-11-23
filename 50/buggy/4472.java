@java.lang.Override
public synchronized void storeUpperLimit(final long limit) {
    DebugLogger.logger.debug("[PUT] Storing upper limit of {}.", limit);
    attemptToStoreTimestampBound(java.util.Optional.of(currentLimit), limit);
}