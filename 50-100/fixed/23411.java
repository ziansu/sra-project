@java.lang.Override
public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
    long bytesRead = super.read(sink, byteCount);
    totalBytesRead += (bytesRead != (-1)) ? bytesRead : 0;
    progressListener.update(((responseBody.contentLength()) != 0 ? ((totalBytesRead) * 100) / (responseBody.contentLength()) : 100), (bytesRead == (-1)));
    return bytesRead;
}