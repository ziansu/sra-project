public int getCrc16() {
    if (((bitBufferLen) % 8) != 0)
        throw new java.lang.IllegalStateException();
    
    updateCrcs();
    if (((crc16) >>> 16) != 0)
        throw new java.lang.AssertionError();
    
    return crc16;
}