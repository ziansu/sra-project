private char charAt(int pos) {
    return (bufferChars) == null ? buffer.charAt(bufferIndex) : bufferChars[bufferIndex];
}