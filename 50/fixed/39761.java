@java.lang.Override
public void run() {
    if ((mDownloadListener) != null) {
        mDownloadListener.success((savePath + finalImageName));
    }
}