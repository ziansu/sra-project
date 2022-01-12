@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onWorldLoad(net.minecraftforge.event.world.WorldEvent.Load event) {
    if (isOverworld(event.getWorld())) {
        elec332.core.server.SaveHandler.INSTANCE.load(event.getWorld());
    }
}