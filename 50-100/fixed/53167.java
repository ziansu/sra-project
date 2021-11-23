@java.lang.Override
public void putString(java.lang.String contents, java.lang.String remoteFilename) {
    org.bitmine.fileops.FileStorePrimitivesAwsS3.sLogger.debug(("Uploading string to " + remoteFilename));
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(contents.getBytes());
    com.amazonaws.services.s3.model.ObjectMetadata objectMetadata = new com.amazonaws.services.s3.model.ObjectMetadata();
    s3Client.putObject(bucketName, remoteFilename, inputStream, objectMetadata);
}