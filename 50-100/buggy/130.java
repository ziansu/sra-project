private org.apache.hadoop.hbase.regionserver.InternalScanner createScanner(org.apache.hadoop.hbase.regionserver.Store store) throws java.io.IOException {
    org.apache.hadoop.hbase.regionserver.InternalScanner internalScanner = null;
    org.apache.hadoop.hbase.client.Scan scan = new org.apache.hadoop.hbase.client.Scan();
    scan.setMaxVersions();
    internalScanner = new org.apache.hadoop.hbase.regionserver.StoreScanner(store, store.getScanInfo(), scan, java.util.Collections.singletonList(scanner), ScanType.COMPACT_RETAIN_DELETES, smallestReadPoint, org.apache.hadoop.hbase.HConstants.OLDEST_TIMESTAMP);
    return internalScanner;
}