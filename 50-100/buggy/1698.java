public void run() {
    try {
        if ((mCastManager) != null) {
            mCastManager.stopApplication();
            mCastManager.disconnectDevice(false, false, false);
        }
        if ((mDataCastManager) != null) {
            mDataCastManager.stopApplication();
            mDataCastManager.disconnect();
        }
    } catch (com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException | com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException e) {
        e.printStackTrace();
    } finally {
        currentDevices.clear();
        mCastManager = null;
        mDataCastManager = null;
    }
}