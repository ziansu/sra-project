private void completeMultipart(java.lang.String bucketName, java.lang.String objectName, java.lang.String uploadId, java.util.List<io.minio.Part> parts) throws io.minio.ErrorResponseException, io.minio.InternalException, io.minio.InvalidBucketNameException, io.minio.NoResponseException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    java.util.Map<java.lang.String, java.lang.String> queryParamMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    queryParamMap.put("uploadId", uploadId);
    io.minio.CompleteMultipartUpload completeManifest = new io.minio.CompleteMultipartUpload();
    completeManifest.setParts(parts);
    executePost(bucketName, objectName, completeManifest.toString().getBytes("UTF-8"), queryParamMap);
}