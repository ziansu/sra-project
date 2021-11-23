@java.lang.Override
public void connect() throws java.io.IOException {
    try {
        if (socket.isConnectionPending()) {
            if (socket.finishConnect()) {
                listener.connect(this);
            }
            return ;
        }
        if (!(socket.isConnected())) {
            if (socket.connect(socketAddress)) {
                listener.connect(this);
            }
        }
    } catch (java.io.IOException | java.lang.RuntimeException e) {
        try {
            socket.close();
        } catch (java.io.IOException ignore) {
        }
        throw e;
    }
}