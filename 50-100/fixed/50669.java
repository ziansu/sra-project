@org.junit.Test
public void testUpdate() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    org.pentaho.big.data.impl.cluster.NamedClusterImpl namedCluster = new org.pentaho.big.data.impl.cluster.NamedClusterImpl();
    java.lang.String testName = "testName";
    namedCluster.setName(testName);
    namedClusterManager.update(namedCluster, metaStore);
    verify(metaStoreFactory).deleteElement(testName);
    verify(metaStoreFactory).saveElement(org.mockito.Matchers.eq(namedCluster));
}