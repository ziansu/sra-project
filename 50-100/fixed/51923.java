public char nextChar() throws com.icegreen.greenmail.imap.ProtocolException {
    if (!(nextSeen)) {
        try {
            nextChar = ((char) (input.read()));
            nextSeen = true;
        } catch (java.io.IOException e) {
            throw new com.icegreen.greenmail.imap.ProtocolException("Error reading from stream.", e);
        }
    }
    return nextChar;
}