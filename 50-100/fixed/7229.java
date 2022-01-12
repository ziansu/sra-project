@org.junit.Ignore
@org.junit.Test
public void performanceTest() throws java.lang.Exception {
    java.lang.String hdfsStoreName = "org.apache.kylin.storage.hdfs.HDFSResourceStore";
    org.apache.kylin.common.persistence.ResourceStoreTest.testPerformance(org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hdfs", kylinConfig), kylinConfig);
    java.lang.String hbaseStoreName = "org.apache.kylin.storage.hbase.HBaseResourceStore.HBaseResourceStore";
    org.apache.kylin.common.persistence.ResourceStoreTest.testPerformance(org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hbase", kylinConfig), kylinConfig);
}