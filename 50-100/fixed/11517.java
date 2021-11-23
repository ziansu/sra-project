@org.junit.Test
public void testListNames_emptymetaStoreFactory() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    org.pentaho.metastore.api.IMetaStore metaStore = mock(org.pentaho.metastore.api.IMetaStore.class);
    java.util.List<java.lang.String> expectedNames = new java.util.ArrayList<>();
    verify(metaStoreFactory, never()).getElementNames();
    assertEquals(expectedNames, namedClusterManager.listNames(metaStore));
}