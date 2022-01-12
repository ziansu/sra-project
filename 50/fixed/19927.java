public boolean info(java.lang.String s, java.lang.Object... objects) {
    return this.info(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), s, objects);
}