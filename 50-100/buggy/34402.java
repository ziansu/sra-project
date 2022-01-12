@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void tickPlayer(cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent event) {
    if ((((event.player) != null) && (!(event.player.isDead))) && (com.darkona.adventurebackpack.util.Wearing.isWearingWearable(event.player))) {
        if ((event.phase) == (TickEvent.Phase.START)) {
            com.darkona.adventurebackpack.playerProperties.BackpackProperty.get(event.player).executeWearableUpdateProtocol();
        }
        if ((event.phase) == (TickEvent.Phase.END)) {
            if (event.side.isServer()) {
                com.darkona.adventurebackpack.playerProperties.BackpackProperty.syncToNear(event.player);
            }
        }
    }
}