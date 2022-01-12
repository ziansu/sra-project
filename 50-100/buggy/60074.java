static com.winthier.ore.OreChunk of(org.bukkit.block.Block block) {
    int x = (block.getX()) >> 4;
    int y = (block.getY()) >> 4;
    int z = (block.getZ()) >> 4;
    return new com.winthier.ore.OreChunk(x, y, z, block.getBiome(), block.getChunk().isSlimeChunk());
}