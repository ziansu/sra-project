private org.apache.hadoop.hbase.wal.WAL createWAL(final org.apache.hadoop.conf.Configuration c, org.apache.hadoop.hbase.wal.WALFactory walFactory) throws java.io.IOException {
    org.apache.hadoop.hbase.wal.WAL wal = walFactory.getWAL(new byte[]{  });
    org.apache.hadoop.hbase.HBaseTestingUtility.setMaxRecoveryErrorCount(((org.apache.hadoop.hbase.regionserver.wal.FSHLog) (wal)).getOutputStream(), 1);
    return wal;
}