public void onPause() {
    socket.close();
    socket = null;
    super.onPause();
}