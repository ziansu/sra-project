public org.apache.cassandra.io.util.SegmentedFile complete(java.lang.String path) {
    return complete(getChannel(path), (-1));
}