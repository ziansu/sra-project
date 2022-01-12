@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    eu.thog92.thaumicthings.ThaumicThings.log = event.getModLog();
    eu.thog92.thaumicthings.ThaumicThings.proxy.loadConfiguration(event.getSuggestedConfigurationFile());
    eu.thog92.thaumicthings.ThaumicThings.proxy.initContents();
    if (cpw.mods.fml.common.Loader.isModLoaded("betterstorage"))
        eu.thog92.thaumicthings.addons.betterstorage.AddonBetterStorage.preInit();
    
    eu.thog92.thaumicthings.ThaumicThings.proxy.registerRenders();
}