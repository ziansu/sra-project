private org.apache.hadoop.hbase.regionserver.MemStoreSegment generateMemStoreSegmentByType(org.apache.hadoop.hbase.regionserver.CellSet.Type type, org.apache.hadoop.hbase.CellComparator comparator, org.apache.hadoop.hbase.regionserver.MemStoreLAB memStoreLAB, long size) {
    org.apache.hadoop.hbase.regionserver.CellSet set = new org.apache.hadoop.hbase.regionserver.CellSet(type, comparator);
    return new org.apache.hadoop.hbase.regionserver.MemStoreSegment(set, memStoreLAB, size, comparator);
}