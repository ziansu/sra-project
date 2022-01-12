public void discard(int bytesToDiscard) {
    int remainingBytes = bytesToDiscard;
    if ((remainingBytes < 0) || (remainingBytes > (size()))) {
        throw new java.lang.RuntimeException((((("bytesToDiscard must be an integer between 0 and size(). " + "bytesToDiscard=") + remainingBytes) + ", size()=") + (size())));
    }
    response = null;
    while (remainingBytes >= (chunkSize)) {
        bytesList.remove(0);
        remainingBytes -= chunkSize;
    } 
    startIndexOfFirstChunk = remainingBytes;
}