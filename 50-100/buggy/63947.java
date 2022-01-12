public static void overrideDefault() {
    net.minecraftforge.common.DimensionManager.unregisterProviderType(net.minecraftforge.common.DimensionManager.getProviderType(0));
    if (cpw.mods.fml.common.Loader.isModLoaded("BiomesOPlenty")) {
        net.minecraftforge.common.DimensionManager.registerProviderType(0, dmillerw.time.world.WorldProviderOverworldBOP.class, false);
    }else {
        net.minecraftforge.common.DimensionManager.registerProviderType(0, dmillerw.time.world.WorldProviderOverworld.class, false);
    }
}