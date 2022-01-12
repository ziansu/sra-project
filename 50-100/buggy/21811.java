@org.junit.Test
public void testgetCountByName() {
    org.junit.Assert.assertTrue(((clusterConfigDao.getCountByName("test")) == 0));
    org.smartdata.model.ClusterConfig clusterConfig = new org.smartdata.model.ClusterConfig(1, "test", "test1");
    clusterConfigDao.insert(clusterConfig);
    org.junit.Assert.assertTrue(((clusterConfigDao.getCountByName("test")) == 0));
}