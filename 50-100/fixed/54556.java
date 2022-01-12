@java.lang.Override
public void setInventorySlotContents(int index, net.minecraft.item.ItemStack stack) {
    inventoryHelper.setInventorySlotContents(getInventoryStackLimit(), index, stack);
    if (index < (RemoteStorageContainer.SLOT_LINKER)) {
        copyFromModule(stack, index);
    }
    worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    if (!(worldObj.isRemote)) {
        link(index);
    }
}