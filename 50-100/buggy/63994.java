public static FilesDataUnit.Entry addFile(eu.unifiedviews.dataunit.files.WritableFilesDataUnit dataUnit, java.io.File file, java.lang.String path) throws eu.unifiedviews.dataunit.DataUnitException {
    final java.lang.String symbolicName = path;
    dataUnit.addExistingFile(symbolicName, file.toURI().toString());
    eu.unifiedviews.helpers.dataunit.metadata.MetadataUtils.add(dataUnit, symbolicName, FilesVocabulary.UV_VIRTUAL_PATH, symbolicName);
    return new eu.unifiedviews.helpers.dataunit.files.FilesDataUnitUtils.InMemoryEntry(file.toString(), symbolicName);
}