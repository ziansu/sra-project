public boolean add(int[] arrayRecord) {
    org.deidentifier.arx.clustering.TassaRecord r = new org.deidentifier.arx.clustering.TassaRecord(arrayRecord);
    r.assignedCluster = this;
    return this.add(r);
}