@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    zairus.hermitquest.HermitQuest.logger = event.getModLog();
    zairus.hermitquest.HermitQuest.proxy.preInit(event);
    zairus.hermitquest.HQConfig.init(event.getSuggestedConfigurationFile());
    zairus.hermitquest.sound.HQSoundEvents.register();
}