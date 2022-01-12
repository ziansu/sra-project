@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((socketListener_t) != null) {
        C.SOCKET_LISTENER = false;
        socketListener_t.interrupt();
    }
}