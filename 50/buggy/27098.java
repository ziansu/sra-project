@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    untouchedwagons.minecraft.mcrd.MinecraftResourceDumperMod.minecraftResourceDumperAPI.getModSupportServiceRepository().loadModSupportServices();
    untouchedwagons.minecraft.mcrd.MinecraftResourceDumperMod.minecraftResourceDumperAPI.getModSupportServiceRepository().initModSupportServices(untouchedwagons.minecraft.mcrd.MinecraftResourceDumperMod.minecraftResourceDumperAPI);
    untouchedwagons.minecraft.mcrd.MinecraftResourceDumperMod.proxy.registerCommandHandlers();
}