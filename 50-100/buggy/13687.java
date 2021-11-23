@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void WorldUnloadEvent(net.minecraftforge.event.world.WorldEvent.Unload evt) {
    if ((evt.getWorld().provider.getDimension()) == 0) {
        blocks.clear();
    }
    worldCaches.remove(evt.getWorld().provider.getDimension());
}