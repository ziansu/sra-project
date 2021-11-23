public boolean canDecode(byte[] buffer) {
    compressedStream = buffer;
    boolean canDecode = (internalGetFormat(convertArguments(new java.lang.String[]{  }))) == 0;
    compressedStream = null;
    return canDecode;
}