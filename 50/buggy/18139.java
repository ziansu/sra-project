@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((com.ntu.mpp.slapface.HostActivity.mServerAgent) != null) {
        com.ntu.mpp.slapface.HostActivity.mServerAgent.clear();
    }
    C.SOCKET_LISTENER = false;
    socketListener_t.interrupt();
}