@java.lang.Override
public net.minecraft.item.ItemStack slotClick(int slotId, int clickedButton, int mode, net.minecraft.entity.player.EntityPlayer playerIn) {
    if ((slotId < 0) || (slotId > (this.inventorySlots.size())))
        return null;
    
    mod.cc.items.cardbook.SlotCardBook slot = ((mod.cc.items.cardbook.SlotCardBook) (this.inventorySlots.get(slotId)));
    net.minecraft.item.ItemStack itemstack = slot.getStack();
    if (itemstack != null) {
        slot.onPickupFromSlot(playerIn, itemstack);
    }
    return null;
}