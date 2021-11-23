@java.lang.Override
public void run() {
    try {
        isHost = true;
        socket = new java.net.ServerSocket(PORT_NUMBER).accept();
        initStreams();
        runInteraction();
    } catch (java.io.IOException e) {
        android.util.Log.e("createGame", e.toString());
    }
}