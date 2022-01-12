private java.lang.String initMultipartUpload(java.lang.String bucketName, java.lang.String objectName) throws io.minio.ErrorResponseException, io.minio.InternalException, io.minio.InvalidBucketNameException, io.minio.NoResponseException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    java.util.Map<java.lang.String, java.lang.String> queryParamMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    queryParamMap.put("uploads", "");
    io.minio.HttpResponse response = executePost(bucketName, objectName, queryParamMap, "".getBytes("UTF-8"));
    io.minio.InitiateMultipartUploadResult result = new io.minio.InitiateMultipartUploadResult();
    result.parseXml(response.body().charStream());
    return result.getUploadId();
}