private char charAt(int pos) {
    return (bufferChars) == null ? buffer.charAt(pos) : bufferChars[pos];
}