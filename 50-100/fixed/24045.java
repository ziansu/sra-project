public int getCrc8() {
    if (((bitBufferLen) % 8) != 0)
        throw new java.lang.IllegalStateException();
    
    updateCrcs(((bitBufferLen) / 8));
    if (((crc8) >>> 8) != 0)
        throw new java.lang.AssertionError();
    
    return crc8;
}