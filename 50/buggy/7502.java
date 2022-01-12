@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onSaplingGrow(net.minecraftforge.event.terraingen.SaplingGrowTreeEvent event) {
    if ((com.miningmark48.miscconfigs.handler.ConfigurationHandler.saplingGrowthMultiplier) > 1)
        if ((event.rand.nextInt(ConfigurationHandler.saplingGrowthMultiplier)) != 0) {
            event.setResult(Event.Result.DENY);
        }
    
}