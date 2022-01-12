private void doTestWithPath(java.lang.String path) throws java.lang.Exception {
    org.apache.kylin.common.persistence.ResourceStoreTest.testAStore(org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hdfs", kylinConfig), kylinConfig);
    junit.framework.TestCase.assertTrue(fs.exists(new org.apache.hadoop.fs.Path(path)));
}