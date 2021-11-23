static com.winthier.ore.OreChunk of(org.bukkit.block.Block block) {
    return new com.winthier.ore.OreChunk(((block.getX()) >> 4), ((block.getY()) >> 4), ((block.getZ()) >> 4), block.getBiome(), block.getChunk().isSlimeChunk());
}