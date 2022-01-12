public org.apache.carbondata.core.datastore.chunk.MeasureColumnDataChunk convertToMeasureColDataChunk(int index) {
    assert index < (pagesCount);
    if ((dataChunks) == null) {
        dataChunks = new org.apache.carbondata.core.datastore.chunk.MeasureColumnDataChunk[pagesCount];
    }
    try {
        dataChunks[index] = chunkReader.convertToMeasureChunk(fileReader, blockId, rawData, offSet, length, index);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    return dataChunks[index];
}