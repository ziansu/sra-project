public java.io.InputStream retrieve(java.lang.String key) throws java.io.IOException {
    try {
        if (!(doesObjectExist(key))) {
            com.aliyun.fs.oss.nat.JetOssNativeFileSystemStore.LOG.error(("NoSuchKey: " + key));
            return null;
        }
        com.aliyun.fs.oss.nat.OSSObject object = ossClient.getObject(bucket, key);
        return object.getObjectContent();
    } catch (com.aliyun.oss.ServiceException e) {
        handleServiceException(key, e);
        return null;
    }
}