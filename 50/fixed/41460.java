@java.lang.Override
public java.io.InputStream readRaw(java.lang.String source) throws java.io.IOException {
    java.lang.String[] bucketKey = splitPathToBucketAndKey(source, true);
    com.amazonaws.services.s3.model.S3Object s3Object = this.amazonS3.getObject(bucketKey[0], bucketKey[1]);
    return s3Object.getObjectContent();
}