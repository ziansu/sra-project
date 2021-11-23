@java.lang.Override
public void onPickupFromSlot(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack stack) {
    net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerCraftingEvent(player, stack, grid.getMatrix());
    onCrafting(stack);
    if (!(player.worldObj.isRemote)) {
        grid.onCrafted(player);
        container.sendCraftingSlots();
    }
}