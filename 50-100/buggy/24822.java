private xpra.network.chunks.StreamChunk readCompressed(java.io.InputStream is) throws java.io.IOException {
    while ((is.available()) > 0) {
        final int r = is.read(buffer, 0, buffer.length);
        if (r < 0) {
            return null;
        }
        output.write(buffer, 0, r);
    } 
    patches.put(packetIndex, output.toByteArray());
    return new xpra.network.chunks.HeaderChunk(patches);
}