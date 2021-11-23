public java.lang.Long getTupleCount(java.lang.String table, java.lang.Integer partition) {
    java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Long, java.lang.Long>> partitionToRanges = tableToPartitionsToRanges.get(table.toLowerCase());
    if (partitionToRanges == null) {
        return null;
    }
    java.util.TreeMap<java.lang.Long, java.lang.Long> ranges = partitionToRanges.get(partition);
    java.lang.Long sum = 0L;
    for (java.lang.Long k : ranges.keySet()) {
        sum += ((ranges.get(k)) - k) + 1;
    }
    return sum;
}