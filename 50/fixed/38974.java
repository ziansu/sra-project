@java.lang.Override
public void onProgress(long bytesWritten, long totalSize) {
    super.onProgress(bytesWritten, totalSize);
    updateProgressBar(((int) (bytesWritten)), ((int) (totalSize)));
}