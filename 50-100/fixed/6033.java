@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void renderOverlay(net.minecraftforge.client.event.RenderGameOverlayEvent.Post event) {
    if ((event.isCanceled()) || ((event.type) != (net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.EXPERIENCE)))
        return ;
    
    if (!(net.minecraft.client.Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode)) {
        gui.drawArmor();
    }
}