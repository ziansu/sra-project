@java.lang.Override
public void onPause() {
    super.onPause();
    if (((mWakeLock) != null) && (mWakeLock.isHeld())) {
        mWakeLock.release();
        mWakeLock = null;
    }
    if (mIsServer) {
        if ((mServer) != null) {
            mServer.onPause();
        }
    }else {
        if ((mClient) != null) {
            mClient.onPause();
        }
    }
}