@java.lang.Override
public boolean shouldUseScanner(org.apache.hadoop.hbase.client.Scan scan, org.apache.hadoop.hbase.regionserver.Store store, long oldestUnexpiredTS) {
    return shouldSeek(scan, oldestUnexpiredTS);
}