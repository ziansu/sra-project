public void setConnectionTimeout(long connectionTimeoutInMilliseconds) {
    if ((mConnectionTimeoutInMilliseconds) != connectionTimeoutInMilliseconds) {
        android.util.Log.v(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.BluetoothConnector.TAG, ((("setConnectionTimeout: " + (mConnectionTimeoutInMilliseconds)) + " -> ") + connectionTimeoutInMilliseconds));
        mConnectionTimeoutInMilliseconds = connectionTimeoutInMilliseconds;
        if (((mConnectionTimeoutInMilliseconds) > 0) && ((mClientThreads.size()) > 0)) {
            createConnectionTimeoutTimer();
        }else {
            if ((mConnectionTimeoutTimer) != null) {
                mConnectionTimeoutTimer.cancel();
                mConnectionTimeoutTimer = null;
            }
        }
    }
}