@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void getPlayerData(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
    if (event.wasDeath) {
        com.himself12794.powersapi.storage.PropertiesManager.copyAllOver(event.original, event.entityPlayer);
    }
}