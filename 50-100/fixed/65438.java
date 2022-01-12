public void onActivated(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack itemStack) {
    if (occupied) {
        if (itemStack == null) {
            player.inventory.setInventorySlotContents(player.inventory.currentItem, getSwordToEject());
        }else {
            dropSword();
        }
        occupied = false;
        markDirty();
    }else
        if (itemStack != null) {
            if (ModItems.leechSword.equals(itemStack.getItem())) {
                this.startRitual(player, itemStack);
            }
        }
    
}