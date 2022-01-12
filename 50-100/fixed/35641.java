public void createNetworkProvider(net.minecraft.util.math.BlockPos pos, mcjty.xnet.multiblock.ColorId color, mcjty.xnet.api.keys.NetworkId networkId) {
    mcjty.xnet.multiblock.IntPos posId = new mcjty.xnet.multiblock.IntPos(pos);
    networkProviders.put(posId, networkId);
    cachedProviders = null;
    createCableSegment(pos, color);
    getMappings(blobAllocations.get(posId)).add(networkId);
}