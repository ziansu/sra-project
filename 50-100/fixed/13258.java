protected void removeObject(java.lang.String objectName) {
    cloud.benchflow.minioclient.BenchFlowMinioClient.logger.info(("removeObject: " + objectName));
    try {
        minioClient.removeObject(cloud.benchflow.minioclient.BenchFlowMinioClient.TESTS_BUCKET, objectName);
    } catch (io.minio.errors.InvalidBucketNameException | java.security.NoSuchAlgorithmException | io.minio.errors.InsufficientDataException | java.io.IOException | java.security.InvalidKeyException | io.minio.errors.NoResponseException | org.xmlpull.v1.XmlPullParserException | io.minio.errors.InternalException e) {
        cloud.benchflow.minioclient.BenchFlowMinioClient.logger.error(("Exception in removeObject: " + objectName), e);
    } catch (io.minio.errors.ErrorResponseException e) {
        cloud.benchflow.minioclient.BenchFlowMinioClient.logger.error(("Exception in removeObject: " + objectName), e);
    }
}