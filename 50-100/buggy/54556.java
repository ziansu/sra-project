@java.lang.Override
public void setInventorySlotContents(int index, net.minecraft.item.ItemStack stack) {
    if (index < (RemoteStorageContainer.SLOT_LINKER)) {
        copyFromModule(stack, index);
    }
    inventoryHelper.setInventorySlotContents(getInventoryStackLimit(), index, stack);
    worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    if (!(worldObj.isRemote)) {
        link(index);
    }
}