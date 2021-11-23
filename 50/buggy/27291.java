@java.lang.Override
public java.util.List<com.amazonaws.services.s3.model.Bucket> listBuckets() throws com.amazonaws.AmazonClientException, com.amazonaws.AmazonServiceException {
    return new java.util.ArrayList<com.amazonaws.services.s3.model.Bucket>(objects.keySet());
}