@net.minecraftforge.fml.common.Mod.EventHandler
public void onServerStopping(net.minecraftforge.fml.common.event.FMLServerStoppingEvent event) {
    factionmod.config.Config.saveChunkManagers();
    factionmod.config.Config.saveFactions();
    factionmod.config.Config.saveRelations();
    factionmod.data.InventoryData.save();
    factionmod.handler.EventHandlerChunk.clearRegistry();
    factionmod.handler.EventHandlerFaction.clearRegistry();
    factionmod.handler.EventHandlerRelation.clearRegistry();
}