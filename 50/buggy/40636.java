protected java.lang.String getRootDirectoryForUploadedDataFiles() {
    java.lang.String dataFilesDirectoryPath = settings.getRootDirectoryForUploadedDataFiles();
    dataFilesDirectoryPath = seeToItThatItEndsWithAFileSeparator(dataFilesDirectoryPath);
    return dataFilesDirectoryPath;
}