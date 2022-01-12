public static int numFilledSlots(net.minecraft.inventory.IInventory inv) {
    int num = 0;
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        if (((inv.getStackInSlot(i)) != null) && ((inv.getStackInSlot(i).getCount()) == (inv.getStackInSlot(i).getMaxStackSize())))
            num++;
        
    }
    return num;
}