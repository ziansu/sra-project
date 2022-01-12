public static void log(org.slf4j.Logger logger, org.apache.cassandra.utils.NoSpamLogger.Level level, long minInterval, java.util.concurrent.TimeUnit unit, long nowNanos, java.lang.String message, java.lang.Object... objects) {
    org.apache.cassandra.utils.NoSpamLogger wrapped = org.apache.cassandra.utils.NoSpamLogger.getLogger(logger, minInterval, unit);
    org.apache.cassandra.utils.NoSpamLogger.NoSpamLogStatement statement = wrapped.getStatement(message);
    statement.log(level, nowNanos, objects);
}