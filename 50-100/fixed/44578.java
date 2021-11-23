private net.morbz.minecraft.world.Chunk getChunk(int x, int z, boolean create) {
    int chunkX = x / (Chunk.BLOCKS_PER_CHUNK_SIDE);
    int chunkZ = z / (Chunk.BLOCKS_PER_CHUNK_SIDE);
    net.morbz.minecraft.world.Chunk chunk = chunks[chunkX][chunkZ];
    if ((chunk == null) && create) {
        chunk = new net.morbz.minecraft.world.Chunk(this, chunkX, chunkZ, layers);
        chunks[chunkX][chunkZ] = chunk;
    }
    return chunk;
}