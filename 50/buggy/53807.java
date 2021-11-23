@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.NORMAL, receiveCanceled = true)
public void onEvent(net.minecraftforge.client.event.GuiOpenEvent event) {
    if ((event.getGui()) instanceof net.minecraft.client.gui.GuiOptions) {
        event.setGui(new com.blogspot.jabelarminecraft.magicbeans.gui.GuiConfig(null));
    }
}