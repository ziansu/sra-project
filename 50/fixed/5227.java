public void createCableSegment(net.minecraft.util.math.BlockPos pos, mcjty.xnet.multiblock.ColorId color) {
    mcjty.xnet.multiblock.ChunkBlob blob = getOrCreateBlob(pos);
    blob.createCableSegment(pos, color);
    recalculateNetwork(blob);
}