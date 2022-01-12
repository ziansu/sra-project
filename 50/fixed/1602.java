@org.junit.Test
public void testFileStore() throws java.lang.Exception {
    org.apache.kylin.common.persistence.ResourceStoreTest.testAStore("", org.apache.kylin.common.KylinConfig.getInstanceFromEnv());
}