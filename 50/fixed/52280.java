@net.minecraftforge.fml.common.Mod.EventHandler
public void onServerStarting(net.minecraftforge.fml.common.event.FMLServerStartingEvent event) {
    com.trcgames.dbSynchronizer.DBSynchronizer.worldLoaded = true;
    com.trcgames.dbSynchronizer.database.ServerDatabase.onServerStarting();
}