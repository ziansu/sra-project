@org.junit.Test
public void testRead() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.lang.String testName = "testName";
    org.pentaho.big.data.impl.cluster.NamedClusterImpl namedCluster = new org.pentaho.big.data.impl.cluster.NamedClusterImpl();
    org.mockito.Mockito.when(metaStoreFactory.loadElement(testName)).thenReturn(namedCluster);
    org.junit.Assert.assertTrue((namedCluster == (namedClusterManager.read(testName, metaStore))));
}