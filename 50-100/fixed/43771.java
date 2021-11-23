public byte[] readOctetString() throws java.io.IOException, org.interledger.cryptoconditions.UnsupportedLengthException, org.interledger.cryptoconditions.encoding.IllegalLengthIndicatorException {
    int length = readLengthIndicator();
    if (length == 0)
        return new byte[]{  };
    
    byte[] value = new byte[length];
    int bytesRead = 0;
    bytesRead = stream.read(value, 0, length);
    if (bytesRead < length) {
        throw new java.io.EOFException("Unexpected EOF when trying to decode OER data.");
    }
    return value;
}