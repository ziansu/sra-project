public static boolean doesInvHaveRoom(net.minecraft.item.ItemStack item, net.minecraft.inventory.IInventory inv) {
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        if (((inv.getStackInSlot(i)) == null) || ((item.isItemEqual(inv.getStackInSlot(i))) && ((inv.getStackInSlot(i).getCount()) < (inv.getInventoryStackLimit()))))
            return true;
        
    }
    return false;
}