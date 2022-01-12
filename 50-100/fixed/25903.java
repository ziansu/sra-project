@java.lang.Override
public void close() {
    try {
        if ((myDebuggerReader) != null) {
            myDebuggerReader.stop();
        }
    } finally {
        synchronized(mySocketObject) {
            if ((mySocket) != null) {
                try {
                    mySocket.close();
                } catch (java.io.IOException ignored) {
                }
            }
        }
    }
}