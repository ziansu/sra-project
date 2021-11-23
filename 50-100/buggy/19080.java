@java.lang.SuppressWarnings(value = "unchecked")
private void updateLiveness(int ttl, long timestamp, int localDeletionTime) {
    final java.util.Comparator max = java.util.Comparator.naturalOrder();
    final java.util.Comparator min = java.util.Comparator.reverseOrder();
    this.viewClusteringTtl = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringTtl, ttl, org.apache.cassandra.db.view.TemporalRow.NO_TTL, min);
    this.viewClusteringTimestamp = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringTimestamp, timestamp, org.apache.cassandra.db.view.TemporalRow.NO_TIMESTAMP, max);
    this.viewClusteringLocalDeletionTime = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringLocalDeletionTime, localDeletionTime, org.apache.cassandra.db.view.TemporalRow.NO_DELETION_TIME, max);
}