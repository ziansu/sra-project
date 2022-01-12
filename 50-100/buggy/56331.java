public static java.util.HashMap<java.lang.String, java.lang.String> resolveIds(final net.opentsdb.core.TSDB tsdb, final java.util.ArrayList<byte[]> tags) throws net.opentsdb.uid.NoSuchUniqueId {
    try {
        return net.opentsdb.core.Tags.resolveIdsAsync(tsdb, tags).joinUninterruptibly();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Shouldn't be here", e);
    }
}