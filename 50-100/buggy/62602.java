@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPlayerClone(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
    if (event.isWasDeath()) {
        for (int i = 0; i < (listeners.length); i++) {
            ((de.teamlapen.lib.lib.entity.IPlayerEventListener) (event.getEntity().getCapability(listeners[i], null))).onPlayerClone(event.getOriginal());
        }
    }
}