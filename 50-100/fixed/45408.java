public com.winthier.custom.block.BlockWatcher setBlock(org.bukkit.block.Block block, java.lang.String customId) {
    com.winthier.custom.block.CustomBlock customBlock = getCustomBlock(customId);
    if (customBlock == null)
        throw new java.lang.IllegalArgumentException(("Custom block not found: " + customId));
    
    customBlock.setBlock(block);
    com.winthier.custom.block.BlockWatcher blockWatcher = customBlock.createBlockWatcher(block);
    addBlockWatcher(blockWatcher);
    return blockWatcher;
}