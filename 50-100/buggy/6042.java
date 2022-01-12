@java.lang.Override
public void close() {
    connected = false;
    try {
        if ((objectInStream) != null) {
            objectInStream.close();
            objectInStream = null;
        }
        if ((objectOutStream) != null) {
            objectOutStream.close();
            objectOutStream = null;
        }
        if ((socket) != null) {
            socket.close();
            socket = null;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}