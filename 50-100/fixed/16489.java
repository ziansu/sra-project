public void updateSpatial() {
    profiler.startSection("ChunkSpatial");
    com.chappelle.jcraft.world.chunk.Chunk addedChunk = world.chunkRenderQueue.poll();
    if (addedChunk != null) {
        com.chappelle.jcraft.jme3.BlockChunkControl control = new com.chappelle.jcraft.jme3.BlockChunkControl(this, addedChunk);
        this.spatial.addControl(control);
        chunks.add(control);
    }
    for (com.chappelle.jcraft.jme3.BlockChunkControl chunk : chunks) {
        chunk.updateSpatial();
    }
    profiler.endSection();
}