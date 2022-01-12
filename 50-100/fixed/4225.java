@org.junit.Test
public void getServerPath() {
    at.fhj.swd13.pse.db.entity.Document doc = at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.store("test", getClass().getResource("/testDocs/no_img.png").getFile());
    java.lang.String expected = java.nio.file.Paths.get(at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolder, doc.getStorageLocation()).toString();
    assertEquals(expected, at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.getServerPath(doc));
    at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.removeDocument(doc.getDocumentId());
}