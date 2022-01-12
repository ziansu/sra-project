@java.lang.Override
public net.minecraft.item.ItemStack slotClick(int id, int button, net.minecraft.inventory.ClickType clickType, net.minecraft.entity.player.EntityPlayer player) {
    if ((toolInv) != null)
        toolInv.syncItemToList();
    
    return super.slotClick(id, button, clickType, player);
}