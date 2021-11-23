private int jamgetuword(java.nio.ByteBuffer bb, int offset) {
    int uw;
    uw = (bb.getChar(offset)) + ((bb.getChar((offset + 1))) * 256);
    return uw;
}