public com.chenyirun.theircraft.model.Block getBlock(com.chenyirun.theircraft.model.Point3Int pos) {
    com.chenyirun.theircraft.model.Chunk chunk = new com.chenyirun.theircraft.model.Chunk(pos);
    java.util.List<com.chenyirun.theircraft.model.Block> blocksInChunk = new java.util.ArrayList<>();
    blocksInChunk.addAll(getChunkBlocks(chunk));
    for (com.chenyirun.theircraft.model.Block block : blocksInChunk) {
        if (block == null) {
            continue;
        }
        com.chenyirun.theircraft.model.Point3Int blockLocation = block.getLocation();
        if (pos.equals(blockLocation)) {
            return block;
        }
    }
    return null;
}