@java.lang.Override
public void run() {
    synchronized(this) {
        mRoomCreationViewTimer.cancel();
        mRoomCreationViewTimer = null;
    }
    this.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (null != (mRoomCreationFab)) {
                mRoomCreationFab.show();
            }
        }
    });
}