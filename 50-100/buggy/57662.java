@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onEntityTeleported(net.dyeo.teleporter.event.TeleportEvent.EntityTeleportedEvent event) {
    java.lang.System.out.println("onEntityTeleported");
    if (!(net.dyeo.teleporter.event.TeleportEventHandler.entities.contains(event.getEntityLiving()))) {
        net.dyeo.teleporter.event.TeleportEventHandler.entities.add(event.getEntityLiving());
    }
    if ((net.dyeo.teleporter.event.TeleportEventHandler.entities.size()) == 1) {
        java.lang.System.out.println("onEntityTeleported :: registering for updates");
        MinecraftForge.EVENT_BUS.register(net.dyeo.teleporter.event.TeleportEventHandler.updateHandler);
    }
}