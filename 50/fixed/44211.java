private java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary> readObjectSummaries() {
    lombok.val s3 = org.icgc.dcc.repository.pdc.s3.AWSClientFactory.createS3Client();
    lombok.val bucketReader = new org.icgc.dcc.repository.pdc.s3.PDCBucketReader(s3);
    return bucketReader.readSummaries();
}