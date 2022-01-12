@java.lang.Override
public org.gephi.io.importer.spi.FileImporter getFileImporter(java.io.File file) {
    org.openide.filesystems.FileObject fileObject = org.openide.filesystems.FileUtil.toFileObject(file);
    fileObject = org.gephi.io.importer.api.ImportUtils.getArchivedFile(fileObject);
    org.gephi.io.importer.spi.FileImporterBuilder builder = getMatchingImporter(fileObject);
    if ((fileObject != null) && (builder != null)) {
        org.gephi.io.importer.spi.FileImporter fi = builder.buildImporter();
        return fi;
    }
    return null;
}