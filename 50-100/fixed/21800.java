public void discard(int bytesToDiscard) {
    if ((bytesToDiscard < 0) || (bytesToDiscard > (size()))) {
        throw new java.lang.RuntimeException((((("bytesToDiscard must be an integer between 0 and size(). " + "bytesToDiscard=") + bytesToDiscard) + ", size()=") + (size())));
    }
    response = null;
    while (((startIndexOfFirstChunk) + bytesToDiscard) >= (chunkSize)) {
        bytesList.remove(0);
        bytesToDiscard -= chunkSize;
    } 
    startIndexOfFirstChunk = (startIndexOfFirstChunk) + bytesToDiscard;
}