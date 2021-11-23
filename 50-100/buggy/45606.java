@org.junit.Test
public void get() {
    java.lang.String documentName = "testdoc";
    at.fhj.swd13.pse.db.entity.Document doc = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.store(documentName, getClass().getResource("/testDocs/no_img.png").getFile());
    at.fhj.swd13.pse.db.entity.Document doc2 = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.get(doc.getDocumentId());
    org.junit.Assert.assertEquals(doc, doc2);
    at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.removeDocument(doc.getDocumentId());
}