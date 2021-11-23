@java.lang.Override
public java.io.InputStream getResourceStream(java.lang.String s3Key) throws org.apache.velocity.exception.ResourceNotFoundException {
    com.amazonaws.services.s3.model.S3Object object = amazonS3.getObject(new com.amazonaws.services.s3.model.GetObjectRequest(bucketName, s3Key));
    return object.getObjectContent();
}