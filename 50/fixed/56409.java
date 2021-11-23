public boolean setBitIndex(int bitIndex) {
    if ((0 <= bitIndex) && (bitIndex <= (getBitSize()))) {
        this.bitIndex = bitIndex;
        return true;
    }else
        return false;
    
}