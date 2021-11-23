public void commandContinuationRequest() throws com.icegreen.greenmail.imap.ProtocolException {
    try {
        output.write('+');
        output.write('\r');
        output.write('\n');
        output.flush();
    } catch (java.io.IOException e) {
        throw new com.icegreen.greenmail.imap.ProtocolException("Unexpected exception in sending command continuation request.");
    }
}