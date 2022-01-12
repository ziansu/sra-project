public void recalculateNetwork(mcjty.xnet.multiblock.ChunkBlob blob) {
    blob.fixNetworkAllocations();
    removeCachedNetworksForBlob(blob);
    java.util.Set<mcjty.xnet.multiblock.ChunkBlob> todo = new java.util.HashSet<>();
    java.util.Set<mcjty.xnet.multiblock.ChunkBlob> recalculated = new java.util.HashSet<>();
    recalculated.add(blob);
    todo.add(blob);
    recalculateNetwork(todo, recalculated);
}