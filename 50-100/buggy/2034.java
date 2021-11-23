@java.lang.Override
public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
    long bytesRead = super.read(sink, byteCount);
    totalBytes += (bytesRead != (-1)) ? bytesRead : 0;
    if (null != (progressListener)) {
        android.util.Log.i(com.flymarco.appmanager.module.DownLoader.TAG, "read: ");
        progressListener.update(apkName, totalBytes, (bytesRead == (-1)));
    }
    return bytesRead;
}