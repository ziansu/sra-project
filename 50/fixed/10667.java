@java.lang.Override
public void onFileDownloaded(java.lang.String path) {
    if ((mFileDownloadedListener) != null) {
        mFileDownloadedListener.onFileDownloaded(path);
    }
}