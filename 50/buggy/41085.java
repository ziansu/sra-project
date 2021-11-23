@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void tickEnd(net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent event) {
    if ((event.phase) == (TickEvent.Phase.END)) {
        this.renderOverlays(null);
    }
}