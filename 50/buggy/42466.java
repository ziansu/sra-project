private void connectionScuessed() {
    mConnectedState = com.way.service.XXService.CONNECTED;
    mReconnectTimeout = com.way.service.XXService.RECONNECT_AFTER;
    if ((mConnectionStatusCallback) != null)
        mConnectionStatusCallback.connectionStatusChanged(mConnectedState, "");
    
    increaseLoginTimes();
    if (1 == (getLoginTimes())) {
    }
}