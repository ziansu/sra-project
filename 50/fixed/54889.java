private void assignAllRecords() {
    for (final org.deidentifier.arx.clustering.TassaRecord record : this) {
        record.assignedCluster = this;
    }
}