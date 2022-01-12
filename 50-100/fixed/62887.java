public boolean removeRange(java.lang.String table, java.lang.Integer partition, java.lang.Long from) {
    java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Long, java.lang.Long>> partitionToRanges = tableToPartitionsToRanges.get(table.toLowerCase());
    if (partitionToRanges == null) {
        return false;
    }
    java.util.TreeMap<java.lang.Long, java.lang.Long> ranges = partitionToRanges.get(partition);
    if (ranges == null) {
        return false;
    }
    return (ranges.remove(from)) == null;
}