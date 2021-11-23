@java.lang.Override
public void waitForConnect() throws java.io.IOException {
    try {
        java.lang.Thread.sleep(500L);
    } catch (java.lang.InterruptedException e) {
        throw new java.io.IOException(e);
    }
    synchronized(mySocketObject) {
        if ((myState) != (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.INIT)) {
            throw new java.lang.IllegalStateException((((("Inappropriate state of Python debugger for connecting to Python debugger: " + (myState)) + "; ") + (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.INIT)) + " is expected"));
        }
        doConnect();
    }
}