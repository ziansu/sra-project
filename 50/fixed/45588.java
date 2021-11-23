@java.lang.Override
public void onDestroy() {
    android.util.Log.i(TAG, "onDestroy");
    if (fi.vtt.nubotest.MainActivity.kurentoRoomAPI.isWebSocketConnected()) {
        fi.vtt.nubotest.MainActivity.kurentoRoomAPI.sendLeaveRoom(roomId);
    }
    fi.vtt.nubotest.MainActivity.kurentoRoomAPI.disconnectWebSocket();
    super.onDestroy();
}