@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onEntityTeleported(net.dyeo.teleporter.event.TeleportEvent.EntityTeleportedEvent event) {
    if (!(net.dyeo.teleporter.event.TeleportEventHandler.entities.contains(event.getEntityLiving()))) {
        net.dyeo.teleporter.event.TeleportEventHandler.entities.add(event.getEntityLiving());
    }
    if ((net.dyeo.teleporter.event.TeleportEventHandler.entities.size()) == 1) {
        MinecraftForge.EVENT_BUS.register(net.dyeo.teleporter.event.TeleportEventHandler.updateHandler);
    }
}