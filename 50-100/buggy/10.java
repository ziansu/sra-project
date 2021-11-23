private void handleConnectRequest(com.assistant.connection.ConnectionManager.ConnectRequest request) {
    com.assistant.utils.Log.d(com.assistant.connection.ConnectionManager.TAG, ("handleConnectRequest, request:" + request));
    if (mStopped) {
        com.assistant.utils.Log.d(com.assistant.connection.ConnectionManager.TAG, "handleConnectRequest, mStopped is true");
        removeConnectRequest(request.connId);
        notifyConnectionCreationResult(null, request.listener, true, Connection.CONNECTION_REASON_CODE_CONNECT_REQUEST_CANCELED);
        return ;
    }
    connectToInternal(request.ipAddress, request.port, request.listener, request);
}