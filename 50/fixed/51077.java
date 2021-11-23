public boolean error(java.lang.String s, java.lang.Object... objects) {
    return this.error(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), s, objects);
}