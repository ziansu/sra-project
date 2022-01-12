private java.io.File handleByteArrayMessage(byte[] bytes, java.io.File originalFile, java.io.File tempFile, java.io.File resultFile) throws java.io.IOException {
    org.springframework.util.FileCopyUtils.copy(bytes, tempFile);
    this.renameTo(tempFile, resultFile);
    if ((this.deleteSourceFiles) && (originalFile != null)) {
        originalFile.delete();
    }
    return resultFile;
}