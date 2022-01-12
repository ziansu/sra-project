@org.junit.Test
public void testRead() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.lang.String testName = "testName";
    org.pentaho.big.data.impl.cluster.NamedClusterImpl namedCluster = new org.pentaho.big.data.impl.cluster.NamedClusterImpl();
    when(metaStoreFactory.loadElement(testName)).thenReturn(namedCluster);
    assertTrue((namedCluster == (namedClusterManager.read(testName, metaStore))));
}