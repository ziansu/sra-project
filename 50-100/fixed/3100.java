@org.junit.Test
public void testClusterAutoExportEnabled() {
    com.emc.storageos.db.client.model.Cluster cluster = new com.emc.storageos.db.client.model.Cluster();
    org.junit.Assert.assertFalse(cluster.getAutoExportEnabled());
    cluster.setAutoExportEnabled(false);
    org.junit.Assert.assertFalse(cluster.getAutoExportEnabled());
    cluster.setAutoExportEnabled(true);
    org.junit.Assert.assertTrue(cluster.getAutoExportEnabled());
}