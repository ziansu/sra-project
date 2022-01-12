private long parsePDULength(int offset) {
    byte[] lengthArray = new byte[lengthFieldLength];
    java.lang.System.arraycopy(readBuffer, (offset + (lengthOffset)), lengthArray, 0, lengthFieldLength);
    long length = (new de.sloc.dataformat.Length(lengthArray, lengthFieldLength, new java.lang.String[0]).toLong()) + (this.delta);
    return length;
}