@java.lang.Override
public void finish() {
    android.util.Log.d(io.sargent.chatrooms.ChatActivity.TAG, "finish()");
    mSocket.emit("disconnect", "{}");
    mSocket.off(Socket.EVENT_ERROR, onError);
    mSocket.off(Socket.EVENT_CONNECT_ERROR, onConnectError);
    mSocket.off(Socket.EVENT_CONNECT_TIMEOUT, onConnectError);
    mSocket.off(Socket.EVENT_RECONNECT_ATTEMPT, onReconnectAttempt);
    mSocket.off("message", onMessageRecieved);
    super.finish();
}