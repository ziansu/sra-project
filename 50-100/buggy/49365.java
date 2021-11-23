@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int slot, int amount) {
    net.minecraft.item.ItemStack itemStack = getStackInSlot(slot);
    if (itemStack != null) {
        if ((itemStack.stackSize) <= amount) {
            setInventorySlotContents(slot, null);
        }else {
            itemStack = itemStack.splitStack(amount);
        }
    }
    markDirty();
    if ((syncClient) && (!(worldObj.isRemote))) {
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }
    return itemStack;
}