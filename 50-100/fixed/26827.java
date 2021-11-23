public org.terasology.cities.BlockTheme.Builder register(org.terasology.cities.BlockTypes blockType, org.terasology.world.block.BlockUri blockUri) {
    org.terasology.world.block.Block block = blockManager.getBlock(blockUri);
    if (!(BlockManager.AIR_ID.equals(blockUri))) {
        if ((block == null) || (block.equals(blockManager.getBlock(BlockManager.AIR_ID)))) {
            org.terasology.cities.BlockTheme.logger.warn("Could not resolve block URI \"{}\" - using default", blockUri);
            block = defaultBlock;
        }
    }
    blockMap.put(blockType, block);
    return this;
}