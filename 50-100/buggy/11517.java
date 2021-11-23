@org.junit.Test
public void testListNames_emptymetaStoreFactory() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    org.pentaho.metastore.api.IMetaStore metaStore = org.mockito.Mockito.mock(org.pentaho.metastore.api.IMetaStore.class);
    java.util.List<java.lang.String> expectedNames = new java.util.ArrayList<>();
    org.mockito.Mockito.verify(metaStoreFactory, org.mockito.Mockito.never()).getElementNames();
    org.junit.Assert.assertEquals(expectedNames, namedClusterManager.listNames(metaStore));
}