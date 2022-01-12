public void createBucket(java.lang.String bucketName) {
    s3.createBucket(new com.amazonaws.services.s3.model.CreateBucketRequest(bucketName, region));
}