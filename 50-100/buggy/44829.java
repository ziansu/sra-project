@org.junit.Test
public void addDefaultCollectionDocumentsTest() throws java.lang.Exception {
    com.bagri.core.api.ResultCollection<java.lang.String> ids = ((com.bagri.core.api.ResultCollection<java.lang.String>) (this.getDocManagement().getDocumentUris(null, null)));
    assertEquals(0, ids.size());
    props = new java.util.Properties();
    storeSecurityTest();
    ids = ((com.bagri.core.api.ResultCollection<java.lang.String>) (this.getDocManagement().getDocumentUris("collections.contains(CLN_Security), txFinish = 0", null)));
    assertEquals(4, ids.size());
    props = null;
}