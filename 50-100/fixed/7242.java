public java.lang.Integer getNextDate() {
    len = datesStream.readRecord(buffer2, 0, 4);
    if ((len) != 1) {
        throw new java.lang.IllegalArgumentException("Error: Could not read in another byte.");
    }else {
        numDecrypted += 1;
        return (firstDate) + (java.nio.ByteBuffer.wrap(buffer2).getInt());
    }
}