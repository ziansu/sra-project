private synchronized void start() {
    com.kolomiets.android.btconnector.common.logger.Log.d(com.kolomiets.android.btconnector.service.BtConnectionService.TAG, "start");
    if ((mConnectThread) != null) {
        mConnectThread.cancel();
        mConnectThread = null;
    }
    if ((mConnectedThread) != null) {
        mConnectedThread.cancel();
        mConnectedThread = null;
    }
    setState(com.kolomiets.android.btconnector.service.BtConnectionService.STATE_LISTEN);
    if ((mAcceptThread) == null) {
        mAcceptThread = new com.kolomiets.android.btconnector.service.BtConnectionService.AcceptThread();
        mAcceptThread.start();
    }
}