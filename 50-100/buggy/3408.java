private io.minio.HttpResponse executePost(java.lang.String bucketName, java.lang.String objectName, byte[] data, java.util.Map<java.lang.String, java.lang.String> queryParamMap) throws io.minio.ErrorResponseException, io.minio.InternalException, io.minio.InvalidBucketNameException, io.minio.NoResponseException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    updateRegionMap(bucketName);
    return execute(Method.POST, Regions.INSTANCE.region(bucketName), bucketName, objectName, data, null, queryParamMap);
}