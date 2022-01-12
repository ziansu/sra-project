@org.junit.Test
public void testContains() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.lang.String testName = "testName";
    java.util.List<java.lang.String> names = new java.util.ArrayList<>(java.util.Arrays.asList(testName));
    when(metaStoreFactory.getElementNames()).thenReturn(names);
    assertFalse(namedClusterManager.contains(testName, null));
    assertTrue(namedClusterManager.contains(testName, metaStore));
    assertFalse(namedClusterManager.contains("testName2", metaStore));
}