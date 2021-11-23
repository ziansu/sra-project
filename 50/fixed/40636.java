private java.lang.String getRootDirectoryForUploadedDataFiles() {
    java.lang.String dataFilesDirectoryPath = settings.getRootDirectoryForUploadedDataFiles();
    return seeToItThatItEndsWithAFileSeparator(dataFilesDirectoryPath);
}