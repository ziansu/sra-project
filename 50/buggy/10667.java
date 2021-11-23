@java.lang.Override
public void onFileDownloaded(java.lang.String path) {
    mCurrentExtension = null;
    if ((mFileDownloadedListener) != null) {
        mFileDownloadedListener.onFileDownloaded(path);
    }
}