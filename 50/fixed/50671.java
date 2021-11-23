@java.lang.Override
public boolean isConnected() {
    return (myState) == (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.APPROVED);
}