@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    destroyed = true;
    if ((socket) != null) {
        socket.disconnect();
    }
    connected = false;
    unregisterReceiver(mGPSReceiver);
}