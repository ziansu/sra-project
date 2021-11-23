protected net.minecraft.block.Block hcCobble(net.minecraft.world.World world, int worldX, int worldZ, int chunkX, int chunkZ, int worldY) {
    if (rtg.world.gen.surface.SurfaceBase.undergroundBiomesMod.present()) {
        exterminatorJeff.undergroundBiomes.api.BlockCodes cobble = rtg.world.gen.surface.SurfaceBase.ubColumnCache.column(worldX, worldZ).cobblestone(worldY);
        return cobble.block;
    }else {
        return net.minecraft.init.Blocks.cobblestone;
    }
}