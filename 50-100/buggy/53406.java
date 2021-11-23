@com.google.common.annotations.VisibleForTesting
static long parseTimestamp(java.lang.String fileName) {
    int start = (fileName.lastIndexOf(io.atomix.protocols.raft.storage.snapshot.SnapshotFile.PART_SEPARATOR)) + 1;
    int end = fileName.lastIndexOf(io.atomix.protocols.raft.storage.snapshot.SnapshotFile.EXTENSION_SEPARATOR);
    java.lang.String timestampString = fileName.substring(start, end);
    try {
        java.util.Date timestamp = io.atomix.protocols.raft.storage.snapshot.SnapshotFile.TIMESTAMP_FORMAT.parse(timestampString);
        return timestamp.getTime();
    } catch (java.text.ParseException e) {
        throw new java.lang.RuntimeException(e);
    }
}