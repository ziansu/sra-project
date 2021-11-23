@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onLivingRender(net.minecraftforge.client.event.RenderLivingEvent.Pre event) {
    event.setCanceled(true);
    doRender(event.getRenderer(), event.getEntity(), event.getX(), event.getY(), event.getZ(), event.getEntity().rotationYaw, LLibrary.PROXY.getPartialTicks());
}