public void disconnect() {
    if ((mSocket) != null) {
        mHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                try {
                    if ((mSocket) == null)
                        return ;
                    
                    mSocket.close();
                    mSocket = null;
                    android.util.Log.i(com.saulpower.fayeclient.WebSocketClient.TAG, "socket closed");
                } catch (java.io.IOException ex) {
                    android.util.Log.e(com.saulpower.fayeclient.WebSocketClient.TAG, "Error while disconnecting", ex);
                    onError(ex);
                }
            }
        });
        mHandlerThread.quitSafely();
    }
}