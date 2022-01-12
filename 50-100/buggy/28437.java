public synchronized void setLength(long length) throws tachyon.thrift.BlockInfoException, tachyon.thrift.SuspectedFileSizeException {
    if (isComplete()) {
        throw new tachyon.thrift.SuspectedFileSizeException("InodeFile length was set previously.");
    }
    if (length < 0) {
        throw new tachyon.thrift.SuspectedFileSizeException((("InodeFile new length " + length) + " is negative."));
    }
    mLength = length;
    mBlocks.clear();
    while (length > 0) {
        long blockSize = java.lang.Math.min(length, mBlockSizeBytes);
        getNewBlockId();
        length -= blockSize;
    } 
    setComplete(length);
}