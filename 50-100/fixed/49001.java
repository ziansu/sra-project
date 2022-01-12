private java.io.File handleFileMessage(java.io.File sourceFile, java.io.File tempFile, java.io.File resultFile) throws java.io.IOException {
    if (this.deleteSourceFiles) {
        if (sourceFile.renameTo(resultFile)) {
            return resultFile;
        }
        if (logger.isInfoEnabled()) {
            logger.info(java.lang.String.format("Failed to move file '%s'. Using copy and delete fallback.", sourceFile.getAbsolutePath()));
        }
    }
    org.springframework.util.FileCopyUtils.copy(sourceFile, tempFile);
    this.renameTo(tempFile, resultFile);
    if (this.deleteSourceFiles) {
        sourceFile.delete();
    }
    return resultFile;
}