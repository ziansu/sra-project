@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onLivingRender(net.minecraftforge.client.event.RenderLivingEvent.Pre event) {
    event.setCanceled(true);
    java.lang.System.out.println(net.minecraft.client.Minecraft.getMinecraft().objectMouseOver);
    doRender(event.getRenderer(), event.getEntity(), event.getX(), event.getY(), event.getZ(), event.getEntity().rotationYaw, LLibrary.PROXY.getPartialTicks());
}