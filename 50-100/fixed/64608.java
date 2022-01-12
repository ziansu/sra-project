private io.minio.HttpResponse executeHead(java.lang.String bucketName, java.lang.String objectName) throws io.minio.ErrorResponseException, io.minio.InternalException, io.minio.InvalidBucketNameException, io.minio.NoResponseException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    updateRegionMap(bucketName);
    return execute(Method.HEAD, Regions.INSTANCE.region(bucketName), bucketName, objectName, null, null, null, 0);
}