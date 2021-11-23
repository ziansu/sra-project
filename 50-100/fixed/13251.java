public static boolean hasFullStack(net.minecraft.inventory.IInventory inv) {
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        if ((!(inv.getStackInSlot(i).isEmpty())) && ((inv.getStackInSlot(i).getMaxStackSize()) == (inv.getStackInSlot(i).getCount())))
            return true;
        
    }
    return false;
}