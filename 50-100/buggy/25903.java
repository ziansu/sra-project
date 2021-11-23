@java.lang.Override
public void close() {
    synchronized(mySocketObject) {
        try {
            if ((myDebuggerReader) != null) {
                myDebuggerReader.stop();
            }
        } finally {
            if ((mySocket) != null) {
                try {
                    mySocket.close();
                } catch (java.io.IOException ignored) {
                }
            }
        }
    }
}