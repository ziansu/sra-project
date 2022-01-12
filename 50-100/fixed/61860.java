java.lang.Integer getTuplePartition(java.lang.String table, java.lang.Long tupleId) {
    java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Long, java.lang.Long>> partitionToRanges = tableToPartitionsToRanges.get(table.toLowerCase());
    if (partitionToRanges == null) {
        return -1;
    }
    for (java.lang.Integer partition : partitionToRanges.keySet()) {
        if ((getRangeValue(table, partition, tupleId)) != null) {
            return partition;
        }
    }
    return -1;
}