@org.junit.Test
public void testImportUnknownFormat() {
    java.lang.String fileName = net.sf.jabref.importer.ImportFormatReaderTest.class.getResource(resourceName).getFile();
    net.sf.jabref.importer.ImportFormatReader.UnknownFormatImport unknownFormat = reader.importUnknownFormat(fileName);
    assertEquals(count, unknownFormat.parserResult.getDatabase().getEntryCount());
}