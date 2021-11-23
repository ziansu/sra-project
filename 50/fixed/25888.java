@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onServerDisconnect(treechopper.core.PlayerEvent.PlayerLoggedOutEvent event) {
    StaticHandler.playerHoldShift.remove(event.player.getEntityId());
}