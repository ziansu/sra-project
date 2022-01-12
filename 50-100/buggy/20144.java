protected net.minecraft.block.Block hcCobble(net.minecraft.world.World world, int i, int j, int x, int y, int k) {
    if (cpw.mods.fml.common.Loader.isModLoaded("UndergroundBiomes")) {
        int worldX = i * 16;
        int worldY = k;
        int worldZ = j * 16;
        exterminatorJeff.undergroundBiomes.api.UBStrataColumnProvider columnProvider = UBAPIHook.ubAPIHook.dimensionalStrataColumnProvider.ubStrataColumnProvider(0);
        exterminatorJeff.undergroundBiomes.api.BlockCodes cobble = columnProvider.strataColumn(worldX, worldZ).cobblestone(worldY);
        return cobble.block;
    }else {
        return net.minecraft.init.Blocks.cobblestone;
    }
}