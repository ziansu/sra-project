@org.junit.Test
public void testImportUnknownFormat() {
    net.sf.jabref.importer.ImportFormatReader.UnknownFormatImport unknownFormat = reader.importUnknownFormat(fileName);
    assertEquals(count, unknownFormat.parserResult.getDatabase().getEntryCount());
}