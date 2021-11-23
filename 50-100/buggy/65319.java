@org.junit.Test
public void testContains() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.lang.String testName = "testName";
    java.util.List<java.lang.String> names = new java.util.ArrayList<>(java.util.Arrays.asList(testName));
    org.mockito.Mockito.when(metaStoreFactory.getElementNames()).thenReturn(names);
    org.junit.Assert.assertFalse(namedClusterManager.contains(testName, null));
    org.junit.Assert.assertTrue(namedClusterManager.contains(testName, metaStore));
    org.junit.Assert.assertFalse(namedClusterManager.contains("testName2", metaStore));
}