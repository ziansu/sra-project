@java.lang.Override
public com.aliyun.fs.oss.utils.task.Task createOSSPutTask(java.io.File file, java.lang.String finalDstKey, java.lang.String uploadId, int idx) throws java.io.IOException {
    long contentLength = file.length();
    return new com.aliyun.fs.oss.utils.task.OSSPutTask(ossClientAgent, uploadId, bucket, finalDstKey, contentLength, 0L, idx, file, conf, true);
}