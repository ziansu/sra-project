@org.junit.Test(expected = net.sf.jabref.logic.exporter.SaveException.class)
public final void testPerformExportTrowsSaveException() throws java.io.IOException, java.net.URISyntaxException, net.sf.jabref.logic.exporter.SaveException {
    java.lang.String filename = "ModsExportFormatTestAllFields.bib";
    java.nio.file.Path importFile = java.nio.file.Paths.get(net.sf.jabref.logic.exporter.ModsExportFormatTestFiles.class.getResource(filename).toURI());
    java.util.List<net.sf.jabref.model.entry.BibEntry> entries = testImporter.importDatabase(importFile, java.nio.charset.Charset.defaultCharset()).getDatabase().getEntries();
    modsExportFormat.performExport(databaseContext, "", charset, entries);
}