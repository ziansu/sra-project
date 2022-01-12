@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPlayerClone(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
    for (int i = 0; i < (listeners.length); i++) {
        ((de.teamlapen.lib.lib.entity.IPlayerEventListener) (event.getEntity().getCapability(listeners[i], null))).onPlayerClone(event.getOriginal(), event.isWasDeath());
    }
}