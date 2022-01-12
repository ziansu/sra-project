public com.aliyun.fs.oss.common.FileMetadata retrieveMetadata(java.lang.String key) throws java.io.IOException {
    try {
        if (!(doesObjectExist(key))) {
            return null;
        }
        com.aliyun.fs.oss.nat.ObjectMetadata objectMetadata = ossClient.getObjectMetadata(bucket, key);
        return new com.aliyun.fs.oss.common.FileMetadata(key, objectMetadata.getContentLength(), objectMetadata.getLastModified().getTime());
    } catch (java.lang.Exception e) {
        if (e.getMessage().contains("ResponseCode=404")) {
            return null;
        }
        return null;
    }
}