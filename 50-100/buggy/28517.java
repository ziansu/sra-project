@java.lang.Override
public void waitForConnect() throws java.io.IOException {
    synchronized(mySocketObject) {
        myServerSocket.setSoTimeout(myConnectionTimeout);
        java.net.Socket socket = myServerSocket.accept();
        myConnected = true;
        try {
            myDebuggerReader = new com.jetbrains.python.debugger.pydev.transport.ServerModeDebuggerTransport.DebuggerReader(myDebugger, socket.getInputStream());
        } catch (java.io.IOException e) {
            try {
                socket.close();
            } catch (java.io.IOException ignore) {
            }
            throw e;
        }
        mySocket = socket;
    }
}