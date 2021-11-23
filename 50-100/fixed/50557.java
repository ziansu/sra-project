@org.junit.Test
public void store() {
    java.lang.String documentName = "testdoc";
    at.fhj.swd13.pse.db.entity.Document doc = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.store(documentName, getClass().getResource("/testDocs/no_img.png").getFile());
    assertEquals(documentName, doc.getName());
    at.fhj.swd13.pse.db.entity.Document doc2 = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.get(doc.getDocumentId());
    assertNotNull(doc2);
    at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.removeDocument(doc.getDocumentId());
}