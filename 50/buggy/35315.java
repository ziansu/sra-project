@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    net.silentchaos512.supermultidrills.configuration.Config.init(event.getSuggestedConfigurationFile());
    net.silentchaos512.supermultidrills.item.ModItems.init();
    net.silentchaos512.supermultidrills.configuration.Config.save();
}