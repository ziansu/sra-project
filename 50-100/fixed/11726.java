private io.minio.HttpResponse executeGet(java.lang.String bucketName, java.lang.String objectName, java.util.Map<java.lang.String, java.lang.String> headerMap, java.util.Map<java.lang.String, java.lang.String> queryParamMap) throws io.minio.ErrorResponseException, io.minio.InternalException, io.minio.InvalidBucketNameException, io.minio.NoResponseException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    updateRegionMap(bucketName);
    return execute(Method.GET, Regions.INSTANCE.region(bucketName), bucketName, objectName, headerMap, queryParamMap, null, 0);
}