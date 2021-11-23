@org.junit.Test
public void testDeleteElement() throws org.pentaho.metastore.api.exceptions.MetaStoreException {
    java.lang.String testName = "testName";
    namedClusterManager.delete(testName, metaStore);
    org.mockito.Mockito.verify(metaStoreFactory).deleteElement(testName);
}