public static int numEmptySlots(net.minecraft.inventory.IInventory inv) {
    int num = 0;
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        if ((inv.getStackInSlot(i)) == null)
            num++;
        
    }
    return num;
}