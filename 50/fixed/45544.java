@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void respawnSync(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
    com.himself12794.powersapi.storage.PropertiesManager.runOnRespawn(event.player);
    com.himself12794.powersapi.storage.PropertiesManager.syncPlayerToClient(((net.minecraft.entity.player.EntityPlayerMP) (event.player)));
}