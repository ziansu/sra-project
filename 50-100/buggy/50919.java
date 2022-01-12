public java.util.List<org.robolectric.res.arsc.Chunk.StringPoolChunk.StringPoolSpan> getSpans() {
    java.util.List<org.robolectric.res.arsc.Chunk.StringPoolChunk.StringPoolSpan> result = new java.util.LinkedList<>();
    int idx = offset;
    int nameIndex = buffer.getInt(idx);
    while (nameIndex != (org.robolectric.res.arsc.Chunk.StringPoolChunk.StringPoolStyle.RES_STRING_POOL_SPAN_END)) {
        result.add(new org.robolectric.res.arsc.Chunk.StringPoolChunk.StringPoolSpan(buffer, idx));
        idx += org.robolectric.res.arsc.Chunk.StringPoolChunk.StringPoolSpan.SPAN_LENGTH;
        nameIndex = buffer.getInt(offset);
    } 
    return result;
}