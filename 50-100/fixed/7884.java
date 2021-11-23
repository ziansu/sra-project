public boolean hasPendingConnectRequest(java.lang.String ipAddress) {
    synchronized(mReconnectRequestList) {
        if ((mReconnectRequestList.size()) > 0) {
            logConnectReqeustList();
            for (com.assistant.connection.ConnectionManager.ConnectRequest request : mReconnectRequestList) {
                if (android.text.TextUtils.equals(ipAddress, request.ipAddress)) {
                    com.assistant.utils.Log.d(com.assistant.connection.ConnectionManager.TAG, ("hasPendingConnectRequest, true for ip:" + ipAddress));
                    return true;
                }
            }
        }
    }
    com.assistant.utils.Log.d(com.assistant.connection.ConnectionManager.TAG, ("hasPendingConnectRequest, false for reconnecting:" + ipAddress));
    return false;
}