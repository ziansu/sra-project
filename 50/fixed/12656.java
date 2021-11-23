public java.util.TreeSet<craftoplugin.modules.protection.PrivateBlock> get(final craftoplugin.modules.protection.ChunkSection chunkSection) {
    if (chunkSection == null) {
        return new java.util.TreeSet<craftoplugin.modules.protection.PrivateBlock>();
    }
    return this.getChunks().get(chunkSection.getId());
}