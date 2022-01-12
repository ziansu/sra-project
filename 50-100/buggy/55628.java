@java.lang.Override
public void handleMessage(android.os.Message msg) {
    final com.androidnetworking.interfaces.DownloadProgressListener downloadProgressListener = mDownloadProgressListenerWeakRef.get();
    switch (msg.what) {
        case com.androidnetworking.common.ANConstants.UPDATE :
            if (downloadProgressListener != null) {
                final com.androidnetworking.model.Progress progress = ((com.androidnetworking.model.Progress) (msg.obj));
                downloadProgressListener.onProgress(progress.currentBytes, progress.totalBytes);
            }
            break;
        default :
            super.handleMessage(msg);
            break;
    }
}