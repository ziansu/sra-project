@org.junit.Test
public void testListNames() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.util.List<java.lang.String> names = new java.util.ArrayList<>(java.util.Arrays.asList("testName"));
    org.mockito.Mockito.when(metaStoreFactory.getElementNames()).thenReturn(names);
    org.junit.Assert.assertEquals(names, namedClusterManager.listNames(metaStore));
}