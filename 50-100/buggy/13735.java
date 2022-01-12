@java.lang.Override
protected void onDestroy() {
    android.util.Log.e("State", "Destroy");
    super.onDestroy();
    try {
        clientThread.interrupt();
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}