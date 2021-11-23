@java.lang.Override
public net.minecraft.item.ItemStack slotClick(int id, int button, net.minecraft.inventory.ClickType clickType, net.minecraft.entity.player.EntityPlayer player) {
    toolInv.syncItemToList();
    return super.slotClick(id, button, clickType, player);
}