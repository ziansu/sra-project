static long dictionaryByteSize(com.noctarius.borabora.Input input, long offset) {
    long elementCount = com.noctarius.borabora.ElementCounts.sequenceElementCount(input, offset);
    return com.noctarius.borabora.ByteSizes.containerByteSize(input, offset, (elementCount * 2));
}