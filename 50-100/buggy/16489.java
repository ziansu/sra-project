public void updateSpatial() {
    profiler.startSection("ChunkSpatial");
    com.chappelle.jcraft.world.chunk.Chunk addedChunk = world.chunkRenderQueue.poll();
    while (addedChunk != null) {
        com.chappelle.jcraft.jme3.BlockChunkControl control = new com.chappelle.jcraft.jme3.BlockChunkControl(this, addedChunk);
        this.spatial.addControl(control);
        chunks.add(control);
        addedChunk = world.chunkRenderQueue.poll();
    } 
    for (com.chappelle.jcraft.jme3.BlockChunkControl chunk : chunks) {
        chunk.updateSpatial();
    }
    profiler.endSection();
}