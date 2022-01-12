@java.lang.Override
public synchronized void release() {
    log("release");
    if ((mBridge) == null) {
        android.util.Log.e(org.mozilla.gecko.media.LocalMediaDrmBridge.LOGTAG, "cannot send release to an ended drm bridge");
        mCallbacks.onError("cannot send closeSession to an ended drm bridge");
        return ;
    }
    try {
        mBridge.release();
    } catch (java.lang.Exception e) {
        log("fail to release");
        reportError(e);
    }
}