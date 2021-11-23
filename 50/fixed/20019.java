@java.lang.Override
public void messageReceived(@org.jetbrains.annotations.NotNull
com.jetbrains.python.debugger.pydev.ProtocolFrame frame) {
    if ((myState) == (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.CONNECTED)) {
        myState = com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.APPROVED;
    }
}