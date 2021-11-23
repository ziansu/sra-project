@java.lang.Override
protected void onDestroy() {
    android.util.Log.e("State", "Destroy");
    super.onDestroy();
    try {
        if ((clientThread) != null) {
            clientThread.interrupt();
        }
        if ((socket) != null) {
            socket.close();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}