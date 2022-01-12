@java.lang.Override
public void close() {
    connected = false;
    try {
        objectInStream = null;
        objectOutStream = null;
        if ((socket) != null) {
            socket.close();
            socket = null;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}