public boolean info(long nowNanos, java.lang.Object... objects) {
    return this.log(org.apache.cassandra.utils.NoSpamLogger.Level.INFO, nowNanos, objects);
}