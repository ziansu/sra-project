@cpw.mods.fml.common.eventhandler.SubscribeEvent
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void onRender(net.minecraftforge.client.event.RenderGameOverlayEvent.Pre event) {
    int width = event.resolution.getScaledWidth();
    int height = event.resolution.getScaledHeight();
    net.minecraft.entity.player.EntityPlayer player = mc.thePlayer;
    if ((event.type) == (net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.HOTBAR)) {
        renderNitroAndSpeed(event, width, height, player);
        renderKatanaDash(event, width, height, player);
        renderShotsLeft(event, width, height, player);
    }
}