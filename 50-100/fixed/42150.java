@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onEntityTeleported(net.dyeo.teleporter.event.TeleportEvent.EntityTeleportedEvent event) {
    if (!(net.dyeo.teleporter.event.TeleportEventHandler.entities.contains(event.entityLiving))) {
        net.dyeo.teleporter.event.TeleportEventHandler.entities.add(event.entityLiving);
    }
    if ((net.dyeo.teleporter.event.TeleportEventHandler.entities.size()) == 1) {
        MinecraftForge.EVENT_BUS.register(net.dyeo.teleporter.event.TeleportEventHandler.updateHandler);
    }
}