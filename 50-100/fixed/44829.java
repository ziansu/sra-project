@org.junit.Test
public void addDefaultCollectionDocumentsTest() throws java.lang.Exception {
    com.bagri.core.api.ResultCollection<java.lang.String> ids = ((com.bagri.core.api.ResultCollection<java.lang.String>) (this.getDocManagement().getDocumentUris(null, props)));
    assertEquals(0, ids.size());
    storeSecurityTest();
    ids = ((com.bagri.core.api.ResultCollection<java.lang.String>) (this.getDocManagement().getDocumentUris("collections.contains(CLN_Security), txFinish = 0", props)));
    assertEquals(4, ids.size());
}