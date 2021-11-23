public static float getAmbientOcclusionLightValueOverride(float original, net.minecraft.block.Block block) {
    if ((mods.betterfoliage.common.config.Config.logsEnabled) && (Config.logs.matchesID(block)))
        return 1.0F;
    
    if (Config.leaves.matchesID(block))
        return 0.5F;
    
    return original;
}