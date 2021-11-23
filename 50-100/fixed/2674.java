public void printPlan() {
    for (java.lang.String table : tableToPartitionsToRanges.keySet()) {
        java.lang.System.out.println(("Table " + table));
        java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Long, java.lang.Long>> partitionToRanges = tableToPartitionsToRanges.get(table.toLowerCase());
        for (java.lang.Integer partition : partitionToRanges.keySet()) {
            java.lang.System.out.print(((("Partition " + partition) + ": ") + (printPartition(table, partition))));
            java.lang.System.out.println("");
        }
    }
}