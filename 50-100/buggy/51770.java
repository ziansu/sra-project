@java.lang.Override
public void close() throws java.io.IOException {
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
        if ((clientSocket) != null) {
            clientSocket.close();
            clientSocket = null;
        }
        serverSocket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}