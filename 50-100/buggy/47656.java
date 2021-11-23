private int readUnderlying() throws java.io.IOException {
    if ((byteBufferIndex) >= (byteBufferLen)) {
        if ((byteBufferLen) == (-1))
            return -1;
        
        updateCrcs();
        byteBufferLen = in.read(byteBuffer);
        crcStartIndex = 0;
        if ((byteBufferLen) <= 0)
            return -1;
        
        byteBufferIndex = 0;
    }
    assert (byteBufferIndex) < (byteBufferLen);
    int temp = (byteBuffer[byteBufferIndex]) & 255;
    (byteBufferIndex)++;
    return temp;
}