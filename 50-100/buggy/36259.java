private long parsePDULength() {
    byte[] lengthArray = new byte[lengthFieldLength];
    java.lang.System.arraycopy(readBuffer, lengthOffset, lengthArray, 0, lengthFieldLength);
    return (new de.sloc.dataformat.Length(lengthArray, lengthFieldLength, new java.lang.String[0]).toLong()) + (this.delta);
}