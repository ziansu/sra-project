@java.lang.Override
public void close() {
    synchronized(mySocketObject) {
        try {
            if ((myDebuggerReader) != null) {
                myDebuggerReader.stop();
            }
        } finally {
            if (!(myServerSocket.isClosed())) {
                try {
                    myServerSocket.close();
                } catch (java.io.IOException e) {
                    com.jetbrains.python.debugger.pydev.transport.ServerModeDebuggerTransport.LOG.warn("Error closing socket", e);
                }
            }
        }
    }
}