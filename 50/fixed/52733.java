public org.apache.cassandra.utils.NoSpamLogger.NoSpamLogStatement getStatement(java.lang.String s, long minInterval, java.util.concurrent.TimeUnit unit) {
    return this.getStatement(s, unit.toNanos(minInterval));
}