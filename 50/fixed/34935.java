public boolean updateChunk(net.minecraft.world.chunk.Chunk chunk) {
    synchronized(chunksModified) {
        if (!(chunksModified.contains(chunk))) {
            chunksModified.add(chunk);
            return true;
        }
        return false;
    }
}