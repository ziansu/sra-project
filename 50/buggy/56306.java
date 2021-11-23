@java.lang.Override
public void createImporters(org.polymap.p4.data.imports.refine.csv.ImporterBuilder builder) throws java.lang.Exception {
    if (isSupported(file)) {
        builder.newImporter(new org.polymap.p4.data.imports.refine.csv.CSVFileImporter(), file);
    }
    if ((files) != null) {
        throw new java.lang.RuntimeException("List<File> in context is not yet implemented.");
    }
}