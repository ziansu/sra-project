public void copyFrom(net.minecraft.inventory.IInventory inventory) {
    for (int i = 0; i < (inventory.getSizeInventory()); i++)
        if (i < (getSizeInventory())) {
            net.minecraft.item.ItemStack stack = inventory.getStackInSlot(i);
            if (stack != (net.minecraft.item.ItemStack.EMPTY))
                setInventorySlotContents(i, stack.copy());
            else
                setInventorySlotContents(i, ItemStack.EMPTY);
            
        }
    
}