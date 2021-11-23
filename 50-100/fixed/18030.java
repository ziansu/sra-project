public synchronized void unlock(long timestamp, java.util.UUID requestId) {
    boolean wasRemoved = holdersByTimestamp.remove(timestamp, requestId);
    if (!wasRemoved) {
        throw new com.palantir.atlasdb.timelock.util.LoggableIllegalStateException("A request attempted to unlock a timestamp that was not locked or was locked by another request", com.palantir.logsafe.SafeArg.of("timestamp", timestamp), com.palantir.logsafe.SafeArg.of("requestId", requestId), com.palantir.logsafe.SafeArg.of("currentHolder", holdersByTimestamp.get(timestamp)));
    }
}