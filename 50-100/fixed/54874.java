public java.lang.Integer getNextDate() {
    len = inputStreamDecode.readRecord(buffer1, 0, 9);
    if ((len) != 9) {
        throw new java.lang.IllegalArgumentException("Error: Input DecompressStream must be pointing to file of at least 9 bytes");
    }else {
        currentDate = (java.nio.ByteBuffer.wrap(buffer1).getInt()) - (firstDate);
        numEncrypted += 1;
        return currentDate;
    }
}