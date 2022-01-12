@java.lang.Override
public void run() {
    try {
        socket = new java.net.ServerSocket(PORT_NUMBER).accept();
        initStreams();
        isHost = true;
        runInteraction();
    } catch (java.io.IOException e) {
        android.util.Log.e("createGame", e.toString());
    }
}