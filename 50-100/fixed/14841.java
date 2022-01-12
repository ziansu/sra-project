@java.lang.Override
public void onDisconnected(com.neovisionaries.ws.client.WebSocket websocket, com.neovisionaries.ws.client.WebSocketFrame serverCloseFrame, com.neovisionaries.ws.client.WebSocketFrame clientCloseFrame, boolean closedByServer) throws java.lang.Exception {
    super.onDisconnected(websocket, serverCloseFrame, clientCloseFrame, closedByServer);
    if (closedByServer) {
        com.framgia.ishipper.common.Log.d(com.framgia.ishipper.base.BaseActivity.TAG, "socket disconnected by server");
        if ((mWebSocket) != null)
            mWebSocket.connect();
        
    }else {
        com.framgia.ishipper.common.Log.d(com.framgia.ishipper.base.BaseActivity.TAG, "socket disconnected by client");
    }
}