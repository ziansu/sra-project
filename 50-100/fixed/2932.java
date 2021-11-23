@org.junit.Test
public void testList() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    org.pentaho.big.data.impl.cluster.NamedClusterImpl namedCluster = new org.pentaho.big.data.impl.cluster.NamedClusterImpl();
    namedCluster.setName("testName");
    java.util.List<org.pentaho.big.data.impl.cluster.NamedClusterImpl> value = new java.util.ArrayList(java.util.Arrays.asList(namedCluster));
    when(metaStoreFactory.getElements()).thenReturn(value);
    assertEquals(value, namedClusterManager.list(metaStore));
}