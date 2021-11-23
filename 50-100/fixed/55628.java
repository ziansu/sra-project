@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.androidnetworking.common.ANConstants.UPDATE :
            if ((mDownloadProgressListenerWeakRef) != null) {
                final com.androidnetworking.model.Progress progress = ((com.androidnetworking.model.Progress) (msg.obj));
                mDownloadProgressListenerWeakRef.onProgress(progress.currentBytes, progress.totalBytes);
            }
            break;
        default :
            super.handleMessage(msg);
            break;
    }
}