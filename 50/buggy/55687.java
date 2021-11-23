@net.minecraftforge.fml.common.Mod.EventHandler
public void onServerStopping(net.minecraftforge.fml.common.event.FMLServerStoppingEvent event) {
    com.trcgames.dbSynchronizer.DBSynchronizer.worldLoaded = false;
    com.trcgames.dbSynchronizer.DBSynchronizer.network.sendToAll(new com.trcgames.dbSynchronizer.packets.PacketServerToClient(com.trcgames.dbSynchronizer.packets.PacketServerToClient.StCPacketType.UPDATE_WORLD_LOADING_STATE, "stop"));
    com.trcgames.dbSynchronizer.database.ServerDatabase.onServerStopping();
    com.trcgames.dbSynchronizer.database.DataSaver.killInstance();
}