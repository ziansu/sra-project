@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.LOW)
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public final void onDrawBlockHighlight(net.minecraftforge.client.event.DrawBlockHighlightEvent event) {
    net.minecraft.entity.player.EntityPlayer player = event.getPlayer();
    net.minecraft.item.ItemStack main = player.getHeldItemMainhand();
    net.minecraft.item.ItemStack off = player.getHeldItemOffhand();
    net.minecraft.util.math.BlockPos pos = event.getTarget().getBlockPos();
    float partialTicks = event.getPartialTicks();
    if ((com.primetoxinz.stacksonstacks.IngotPlacer.canBeIngot(main)) || (com.primetoxinz.stacksonstacks.IngotPlacer.canBeIngot(off))) {
        com.primetoxinz.stacksonstacks.IngotPlacer.drawSelectionBox(player, event.getTarget(), 0, partialTicks);
    }
}