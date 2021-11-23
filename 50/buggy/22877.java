private com.amazonaws.services.s3.transfer.Upload uploadMultiPart(java.lang.String bucketName, java.lang.String fileName, java.nio.file.Path filePath, final com.amazonaws.services.s3.transfer.TransferManager tm) {
    com.amazonaws.services.s3.transfer.Upload upload = tm.upload(bucketName, fileName, filePath.toFile());
    return upload;
}