@org.junit.BeforeClass
public static void setUpBeforeClass() throws java.lang.Exception {
    org.apache.hadoop.hbase.replication.TestReplicationBase.setUpBeforeClass();
    admin.removePeer("2");
    org.apache.hadoop.hbase.replication.TestReplicationEndpoint.numRegionServers = utility1.getHBaseCluster().getRegionServerThreads().size();
}