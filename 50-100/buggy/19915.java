public void insertChunk(int tagName, boolean shouldEnterChunk) {
    com.google.common.base.Preconditions.checkNotNull(data);
    com.google.common.base.Preconditions.checkArgument((!(inChunk)), "inside chunk");
    adjustDataAsNeeded(bacta.iff.Iff.CHUNK_HEADER_SIZE);
    data.putInt(bacta.iff.Iff.endianSwap32(tagName));
    data.putInt(bacta.iff.Iff.endianSwap32(4));
    if (shouldEnterChunk)
        enterChunk();
    
}