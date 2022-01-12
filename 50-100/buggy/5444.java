@java.lang.Override
public int read() throws java.io.IOException {
    if ((uncompressedChunkOffset) >= (uncompressedChunkLength)) {
        readNextChunk(uncompressedChunk, 0, uncompressedChunk.length);
        if ((uncompressedChunkLength) == 0) {
            return -1;
        }
    }
    return (uncompressedChunk[((uncompressedChunkOffset)--)]) & 255;
}