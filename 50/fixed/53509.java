public boolean warn(long nowNanos, java.lang.String s, java.lang.Object... objects) {
    return this.log(org.apache.cassandra.utils.NoSpamLogger.Level.WARN, s, nowNanos, objects);
}