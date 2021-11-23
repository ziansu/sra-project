private int countMobCells(final org.apache.hadoop.hbase.client.Table table) throws java.io.IOException {
    org.apache.hadoop.hbase.client.Scan scan = new org.apache.hadoop.hbase.client.Scan();
    scan.setAttribute(MobConstants.MOB_SCAN_RAW, org.apache.hadoop.hbase.util.Bytes.toBytes(java.lang.Boolean.TRUE));
    org.apache.hadoop.hbase.client.ResultScanner results = table.getScanner(scan);
    int count = 0;
    for (org.apache.hadoop.hbase.client.Result res : results) {
        count += res.size();
    }
    results.close();
    return count;
}