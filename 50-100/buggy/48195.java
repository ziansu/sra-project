public org.apache.carbondata.core.datastore.chunk.MeasureColumnDataChunk[] convertToMeasureColDataChunks() {
    if ((dataChunks) == null) {
        dataChunks = new org.apache.carbondata.core.datastore.chunk.MeasureColumnDataChunk[pagesCount];
    }
    for (int i = 0; i < (pagesCount); i++) {
        try {
            dataChunks[i] = chunkReader.convertToMeasureChunk(fileReader, blockId, rawData, offSet, length, i);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
    return dataChunks;
}