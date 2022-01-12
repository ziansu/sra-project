@java.lang.Override
public int read() throws java.io.IOException {
    if (finished) {
        return -1;
    }
    while ((uncompressedOffset) >= (uncompressedLength)) {
        int compressedLength = bufferCompressedData();
        if (finished) {
            return -1;
        }
        decompress(compressedLength, uncompressedChunk, 0, uncompressedChunk.length);
    } 
    return (uncompressedChunk[((uncompressedOffset)--)]) & 255;
}