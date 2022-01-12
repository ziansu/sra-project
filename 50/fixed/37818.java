@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent preEvent) {
    sorazodia.survival.main.SurvivalTweaks.log = preEvent.getModLog();
    sorazodia.survival.main.SurvivalTweaks.log.info("Initializating...");
    sorazodia.survival.main.SurvivalTweaks.log.info("Syncing config");
    sorazodia.survival.main.SurvivalTweaks.configHandler = new sorazodia.survival.config.ConfigHandler(preEvent);
}