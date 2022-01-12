@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onWorldRenderLast(net.minecraftforge.client.event.RenderWorldLastEvent event) {
    net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getMinecraft();
    if (((mc.thePlayer) != null) && ((mc.objectMouseOver) != null)) {
        if ((!(mc.thePlayer.isSneaking())) || ((vazkii.botania.client.core.handler.MultiblockRenderHandler.anchor) != null)) {
            mc.thePlayer.getCurrentEquippedItem();
            renderPlayerLook(mc.thePlayer, mc.objectMouseOver);
        }
    }
}