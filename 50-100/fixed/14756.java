public void skipCheckChunkTypeInt(int expected, int possible) throws java.io.IOException {
    int got = readInt();
    if ((got == possible) || (got < expected)) {
        skipCheckChunkTypeInt(expected, (-1));
    }else
        if (got != expected) {
            throw new java.io.IOException(java.lang.String.format("Expected: 0x%08x, got: 0x%08x", expected, got));
        }
    
}