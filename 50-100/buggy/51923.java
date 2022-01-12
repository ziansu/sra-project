public char nextChar() throws com.icegreen.greenmail.imap.ProtocolException {
    if (!(nextSeen)) {
        int next = -1;
        try {
            next = input.read();
        } catch (java.io.IOException e) {
            throw new com.icegreen.greenmail.imap.ProtocolException("Error reading from stream.", e);
        }
        if (next == (-1)) {
            throw new com.icegreen.greenmail.imap.ProtocolException("Unexpected end of stream.");
        }
        nextSeen = true;
        nextChar = ((char) (next));
    }
    return nextChar;
}