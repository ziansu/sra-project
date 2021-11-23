@java.lang.Override
public byte[] computeCacheKey(io.druid.query.metadata.metadata.SegmentMetadataQuery query) {
    byte[] includerBytes = query.getToInclude().getCacheKey();
    byte[] analysisTypesBytes = query.getAnalysisTypesCacheKey();
    return java.nio.ByteBuffer.allocate(((1 + (includerBytes.length)) + (analysisTypesBytes.length))).put(io.druid.query.metadata.SegmentMetadataQueryQueryToolChest.SEGMENT_METADATA_CACHE_PREFIX).put(includerBytes).put(analysisTypesBytes).array();
}