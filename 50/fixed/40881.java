public boolean log(org.apache.cassandra.utils.NoSpamLogger.Level l, java.lang.String s, long nowNanos, java.lang.Object... objects) {
    return this.getStatement(s, minIntervalNanos).log(l, nowNanos, objects);
}