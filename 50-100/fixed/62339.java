public boolean isBlockEligible(net.minecraft.world.IBlockAccess blockAccess, net.minecraft.block.state.IBlockState blockState, net.minecraft.util.BlockPos pos) {
    boolean result = (mods.betterfoliage.common.config.Config.logsEnabled) && (Config.logs.matchesID(blockState.getBlock()));
    mods.betterfoliage.client.texture.LogTextures.LogInfo logInfo = BetterFoliageClient.logRegistry.logInfoMap.get(blockState);
    result &= ((logInfo != null) && ((logInfo.sideTexture) != null)) && ((logInfo.endTexture) != null);
    return true;
}