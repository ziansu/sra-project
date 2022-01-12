public synchronized void Send(final java.lang.String message) {
    if (pl.programvariables.ProgramVariables.GetTraceFlagForClass_TCPClient())
        Trace.Traces.Debug("LOG: TCPClient synchronized public void Send(final String message)");
    
    try {
        if (pl.programvariables.ProgramVariables.GetTraceFlagForClass_TCPClient())
            Trace.Traces.Debug(("LOG: Sending message: " + message));
        
        outToServer.writeBytes(message);
    } catch (java.io.IOException e) {
        Trace.Traces.Debug(("ERROR: Write message error! " + (e.getMessage())));
        mynotify.NotifyAll();
    }
}