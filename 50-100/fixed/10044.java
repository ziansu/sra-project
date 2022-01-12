@java.lang.Override
public org.gephi.io.importer.spi.FileImporter getFileImporter(org.openide.filesystems.FileObject fileObject) {
    if (fileObject != null) {
        fileObject = org.gephi.io.importer.api.ImportUtils.getArchivedFile(fileObject);
        org.gephi.io.importer.spi.FileImporterBuilder builder = getMatchingImporter(fileObject);
        if ((fileObject != null) && (builder != null)) {
            org.gephi.io.importer.spi.FileImporter fi = builder.buildImporter();
            return fi;
        }
    }
    return null;
}