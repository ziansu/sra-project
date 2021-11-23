@org.junit.Test
public void buildImageUrl() {
    java.lang.String fileName = "testFileName";
    java.lang.String expected = (at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolderUrl) + fileName;
    assertEquals(expected, at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.buildImageUrl(fileName));
}