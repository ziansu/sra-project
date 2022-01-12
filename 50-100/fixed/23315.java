@org.junit.Test
public void testSaveDocument() {
    for (int i = 0; i < 2; i++) {
        javax.ws.rs.core.Response document = subject.saveDocument("valid-id", "tag1,tag2", false, "Hello World", null);
        org.junit.Assert.assertNotNull(document);
        org.junit.Assert.assertEquals(301, document.getStatus());
    }
}