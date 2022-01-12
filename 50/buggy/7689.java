public void warn(java.lang.String s, java.lang.Object... objects) {
    warn(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), s, objects);
}