@java.lang.Override
public synchronized void release() {
    log("release");
    if ((mRemote) == null) {
        android.util.Log.e(org.mozilla.gecko.media.RemoteMediaDrmBridge.LOGTAG, "cannot send release to an ended drm bridge");
        mCallbacks.onError("cannot send release to an ended drm bridge");
        return ;
    }
    try {
        mRemote.release();
        mRemote = null;
    } catch (android.os.DeadObjectException e) {
        log("fail to release");
        reportError(e);
    } catch (android.os.RemoteException e) {
        log("fail to release");
        reportError(e);
    }
}