@java.lang.Override
public java.util.List<com.amazonaws.services.s3.model.Bucket> listBuckets() throws com.amazonaws.AmazonClientException {
    return new java.util.ArrayList(objects.keySet());
}