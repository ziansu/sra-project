@org.junit.Test
public void removeDocument() {
    java.lang.String documentName = "testdoc";
    at.fhj.swd13.pse.db.entity.Document doc = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.store(documentName, getClass().getResource("/testDocs/no_img.png").getFile());
    at.fhj.swd13.pse.db.entity.Document doc2 = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.get(doc.getDocumentId());
    org.junit.Assert.assertNotNull(doc2);
    at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.removeDocument(doc.getDocumentId());
    at.fhj.swd13.pse.db.entity.Document doc3 = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.get(doc.getDocumentId());
    org.junit.Assert.assertNull(doc3);
}