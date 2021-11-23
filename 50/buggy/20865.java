public void runTask() {
    try {
        if (gov.nist.javax.sip.stack.TCPMessageChannel.logger.isLoggingEnabled(LogWriter.TRACE_DEBUG))
            gov.nist.javax.sip.stack.TCPMessageChannel.logger.logDebug("Closing socket");
        
        mySock.close();
    } catch (java.io.IOException ex) {
    }
}