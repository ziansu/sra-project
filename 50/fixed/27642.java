public java.lang.String endCall(int callID) throws net.java.sip.communicator.sip.CommunicationsException {
    try {
        net.java.sip.communicator.sip.SipManager.console.logEntry();
        checkIfStarted();
        return callProcessing.endCall(callID);
    } finally {
        net.java.sip.communicator.sip.SipManager.console.logExit();
    }
}