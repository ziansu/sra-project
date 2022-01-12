@com.google.common.annotations.VisibleForTesting
public java.util.Collection<org.apache.cassandra.db.commitlog.CommitLogSegment> getActiveSegments() {
    return java.util.Collections.unmodifiableCollection(activeSegments);
}