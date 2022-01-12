private java.lang.String getFileName(java.lang.String fileName) {
    java.lang.String relativeBaseFileName = changeSet.getChangeLog().getPhysicalFilePath();
    java.lang.String tempFile = liquibase.util.file.FilenameUtils.concat(liquibase.util.file.FilenameUtils.getFullPath(relativeBaseFileName), fileName);
    if ((tempFile != null) && ((new java.io.File(tempFile).exists()) == true)) {
        fileName = tempFile;
    }else {
        fileName = (liquibase.util.file.FilenameUtils.getFullPath(relativeBaseFileName)) + fileName;
    }
    return fileName;
}