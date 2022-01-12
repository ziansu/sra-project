@java.lang.Override
public int read() throws java.io.IOException {
    while ((uncompressedChunkOffset) >= (uncompressedChunkLength)) {
        int compressedChunkLength = bufferCompressedData();
        if (compressedChunkLength < 0) {
            return -1;
        }
        uncompressedChunkLength = decompressor.decompress(compressed, 0, compressedChunkLength, uncompressedChunk, 0, uncompressedChunk.length);
    } 
    return (uncompressedChunk[((uncompressedChunkOffset)++)]) & 255;
}