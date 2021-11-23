protected void uploadToS3(java.lang.String bucketName, java.nio.file.Path filePath) {
    java.io.File file = filePath.toFile();
    amazonS3.putObject(bucketName, file.getName(), file);
}