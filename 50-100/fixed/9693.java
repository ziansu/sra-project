private java.util.List<java.lang.String> getAllObjects(java.lang.String path) {
    java.util.List<java.lang.String> objects = new java.util.ArrayList<java.lang.String>();
    com.amazonaws.services.s3.model.ListObjectsV2Result listing = client.listObjectsV2(new com.amazonaws.services.s3.model.ListObjectsV2Request().withBucketName(bucketName).withPrefix(ensureTrailingSlashPresent(path)));
    for (com.amazonaws.services.s3.model.S3ObjectSummary objectSummary : listing.getObjectSummaries()) {
        if (!(objectSummary.getKey().equals(ensureTrailingSlashPresent(path)))) {
            objects.add(objectSummary.getKey());
        }
    }
    return objects;
}