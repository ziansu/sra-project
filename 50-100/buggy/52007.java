@java.lang.Override
public void setInventorySlotContents(int slotIndex, net.minecraft.item.ItemStack itemStack) {
    if (slotIndex < (inventory.length)) {
        if (itemStack != null) {
            net.minecraft.item.ItemStack copiedItemStack = itemStack.copy();
            copiedItemStack.stackSize = 1;
            inventory[slotIndex] = copiedItemStack;
        }else {
            inventory[slotIndex] = itemStack;
        }
    }
}