@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent evt) {
    sct.hexxitgear.setup.HexxitGearConfig.setConfigFolderBase(evt.getModConfigurationDirectory());
    sct.hexxitgear.setup.HexxitGearConfig.loadCommonConfig(evt);
    sct.hexxitgear.setup.HexxitGearConfig.extractLang(new java.lang.String[]{ "en_US" });
    sct.hexxitgear.setup.HexxitGearConfig.loadLang();
    sct.hexxitgear.setup.HexxitGearConfig.registerDimBlacklist();
    sct.hexxitgear.HexxitGear.logger = evt.getModLog();
    sct.hexxitgear.HexxitGear.playerEventHandler = new sct.hexxitgear.event.PlayerEventHandler();
    MinecraftForge.EVENT_BUS.register(sct.hexxitgear.HexxitGear.playerEventHandler);
}