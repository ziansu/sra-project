@org.junit.Test
public void testFileNotFound() throws java.lang.Throwable {
    final org.icij.extract.extractor.Extractor extractor = new org.icij.extract.extractor.Extractor();
    final org.icij.extract.document.Document document = factory.create(java.nio.file.Paths.get("nothing"));
    thrown.expect(java.nio.file.NoSuchFileException.class);
    thrown.expectMessage("nothing");
    extractor.extract(document);
}