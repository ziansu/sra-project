public static xyz.jadonfowler.phasebot.world.Chunk getChunk(int x, int y, int z) {
    for (xyz.jadonfowler.phasebot.world.ChunkColumn cl : xyz.jadonfowler.phasebot.world.ChunkColumn.chunks)
        if (((cl.x) == x) && ((cl.z) == z)) {
            if (((cl.y[y]) == null) || ((cl.y[y].getBlocks()) == null))
                continue;
            
            return cl.y[y];
        }
    
    return null;
}