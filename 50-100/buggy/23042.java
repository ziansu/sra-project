public org.apache.hadoop.hbase.ClusterStatus getClusterStatus() throws java.io.IOException {
    org.apache.hadoop.hbase.client.Admin admin = null;
    org.apache.hadoop.hbase.ClusterStatus clusterStatus = null;
    try {
        org.apache.hadoop.hbase.client.Connection connection = com.cloudera.impala.catalog.HBaseTable.ConnectionHolder.getConnection(com.cloudera.impala.catalog.HBaseTable.hbaseConf_);
        admin = connection.getAdmin();
        clusterStatus = admin.getClusterStatus();
    } finally {
        admin.close();
    }
    return clusterStatus;
}