public static blusunrize.immersiveengineering.api.tool.ExcavatorHandler.MineralMix getRandomMineral(net.minecraft.world.World world, int chunkX, int chunkZ) {
    if (world.isRemote)
        return null;
    
    blusunrize.immersiveengineering.api.tool.ExcavatorHandler.MineralWorldInfo info = blusunrize.immersiveengineering.api.tool.ExcavatorHandler.getMineralWorldInfo(world, chunkX, chunkZ);
    if ((info == null) || ((info.mineral) == null))
        return null;
    
    if (((blusunrize.immersiveengineering.api.tool.ExcavatorHandler.mineralVeinCapacity) >= 0) && ((info.depletion) > (blusunrize.immersiveengineering.api.tool.ExcavatorHandler.mineralVeinCapacity)))
        return null;
    
    return (info.mineralOverride) != null ? info.mineralOverride : info.mineral;
}