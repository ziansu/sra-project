protected net.minecraft.block.Block hcStone(net.minecraft.world.World world, int worldX, int worldZ, int chunkX, int chunkZ, int worldY) {
    if (rtg.world.gen.surface.SurfaceBase.abyssalCraftMod.present()) {
        return com.shinoow.abyssalcraft.api.block.ACBlocks.darkstone;
    }else {
        return net.minecraft.init.Blocks.stone;
    }
}