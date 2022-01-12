public static org.bukkit.Chunk loadChunk(org.bukkit.World world, double[] coords) {
    org.bukkit.Chunk chunk = world.getChunkAt(((int) (coords[0])), ((int) (coords[1])));
    if (!(chunk.isLoaded())) {
        chunk.load(true);
    }
    return chunk;
}