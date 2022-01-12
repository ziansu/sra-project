private static final java.lang.String calculateType(final org.alfresco.extension.bulkimport.source.fs.MetadataLoader metadataLoader, final java.io.File contentFile, final java.io.File metadataFile, final java.lang.String typeFolder, final java.lang.String typeFile) {
    java.lang.String result = null;
    final org.alfresco.extension.bulkimport.source.fs.MetadataLoader.Metadata metadata = metadataLoader.loadMetadata(metadataFile);
    result = metadata.getType();
    if ((result == null) && (contentFile != null)) {
        result = (contentFile.isDirectory()) ? typeFolder : typeFile;
    }else {
        result = typeFile;
    }
    return result;
}