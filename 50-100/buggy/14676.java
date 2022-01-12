public Chunk getChunk(Point p) {
    if (((((p.x) < 0) || ((p.y) < 0)) || ((p.x) >= (size.width))) || ((p.x) >= (size.height))) {
        return null;
    }
    return chunks[((p.y) / (Level.chunkSize.height))][((p.x) / (Level.chunkSize.width))];
}