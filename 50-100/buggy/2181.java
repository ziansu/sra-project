@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.NORMAL)
public void onEvent(net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent event) {
    if ((FierySouls.MODID.equals(event.getModID())) && (event.getConfigID().equals(com.yooksi.fierysouls.common.FSConfiguration.TORCH_CATEGORY))) {
        boolean result = (event.isWorldRunning()) && (!(com.yooksi.fierysouls.common.FSConfiguration.config.getCategory(com.yooksi.fierysouls.common.FSConfiguration.TORCH_CATEGORY).requiresWorldRestart()));
        if (result && (!(event.isRequiresMcRestart())))
            com.yooksi.fierysouls.common.FSConfiguration.syncConfig(false, true);
        
    }
}