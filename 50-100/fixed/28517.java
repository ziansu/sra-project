@java.lang.Override
public void waitForConnect() throws java.io.IOException {
    myServerSocket.setSoTimeout(myConnectionTimeout);
    synchronized(mySocketObject) {
        mySocket = myServerSocket.accept();
        myConnected = true;
    }
    try {
        synchronized(mySocketObject) {
            myDebuggerReader = new com.jetbrains.python.debugger.pydev.transport.ServerModeDebuggerTransport.DebuggerReader(myDebugger, mySocket.getInputStream());
        }
    } catch (java.io.IOException e) {
        try {
            mySocket.close();
        } catch (java.io.IOException ignore) {
        }
        throw e;
    }
}