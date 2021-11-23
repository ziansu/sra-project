private stroom.index.server.IndexShardWriter getIndexShardWriter() throws stroom.index.server.IndexException {
    final stroom.index.server.IndexShardWriter indexShardWriter = indexShardCache.get(indexShardKey);
    if (indexShardWriter == null) {
        throw new stroom.index.server.IndexException((("Unable to get writer for index '" + (indexShardKey.getIndex().getName())) + "'. Please check the index has active volumes."));
    }
    return indexShardWriter;
}