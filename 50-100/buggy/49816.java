@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    tehnut.goodybags.GoodyBags.configDir = new java.io.File((((event.getModConfigurationDirectory()) + (java.io.File.pathSeparator)) + (ModInformation.ID)));
    tehnut.goodybags.GoodyBags.configDir.mkdirs();
    tehnut.goodybags.GoodyBags.bagCache = new tehnut.goodybags.util.cache.PermanentCache<tehnut.goodybags.base.Bag>(((ModInformation.ID) + "Cache"));
    tehnut.goodybags.registry.ItemRegistry.registerItems();
}