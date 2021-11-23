private void updateLiveness(int ttl, long timestamp, int localDeletionTime) {
    this.viewClusteringTtl = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringTtl, ttl, org.apache.cassandra.db.view.TemporalRow.NO_TTL, java.util.Comparator.reverseOrder());
    this.viewClusteringTimestamp = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringTimestamp, timestamp, org.apache.cassandra.db.view.TemporalRow.NO_TIMESTAMP, java.util.Comparator.naturalOrder());
    this.viewClusteringLocalDeletionTime = org.apache.cassandra.db.view.TemporalRow.valueIfSet(viewClusteringLocalDeletionTime, localDeletionTime, org.apache.cassandra.db.view.TemporalRow.NO_DELETION_TIME, java.util.Comparator.naturalOrder());
}