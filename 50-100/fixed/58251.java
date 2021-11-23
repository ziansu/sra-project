public com.github.zhongl.ipage.Chunk<T> grow() throws java.io.IOException {
    long beginPosition = (chunks.isEmpty()) ? 0L : (last().endPosition()) + 1;
    java.io.File file = new java.io.File(baseDir, java.lang.Long.toString(beginPosition));
    com.github.zhongl.ipage.Chunk<T> chunk = com.github.zhongl.ipage.Chunk.appendableChunk(file, beginPosition, capacity, accessor);
    convertLastRecentlyUsedChunkToReadOnly();
    chunks.addLast(chunk);
    return chunk;
}