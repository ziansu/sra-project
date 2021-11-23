private java.io.File handleStringMessage(java.lang.String content, java.io.File originalFile, java.io.File tempFile, java.io.File resultFile) throws java.io.IOException {
    java.io.OutputStreamWriter writer = new java.io.OutputStreamWriter(new java.io.FileOutputStream(tempFile), this.charset);
    org.springframework.util.FileCopyUtils.copy(content, writer);
    tempFile.renameTo(resultFile);
    if ((this.deleteSourceFiles) && (originalFile != null)) {
        originalFile.delete();
    }
    return resultFile;
}