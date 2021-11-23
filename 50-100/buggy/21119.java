private com.sap.hadoop.ds.sortedmap.ByteBasedSortedMap persist(int i) throws com.sap.hadoop.ds.BaseException {
    try {
        com.sap.hadoop.ds.sortedmap.ByteBasedSortedMap mp = partitions.get(i);
        if (mp instanceof com.sap.hadoop.ds.sortedmap.ByteBasedSortedMap) {
            java.io.File f = java.io.File.createTempFile("wdw", null, dir);
            mp = new com.sap.hadoop.ds.sortedmap.PersistentByteBasedSortedMap(f, mp, comparator);
            partitions.set(i, mp);
        }
        return mp;
    } catch (java.io.IOException ie) {
        throw new com.sap.hadoop.ds.BaseException(ie);
    }
}