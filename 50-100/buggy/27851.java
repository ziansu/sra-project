@java.lang.Override
public void setInventorySlotContents(int slot, dk.mrspring.toggle.tileentity.ItemStack stack) {
    if ((slot >= 0) && (slot < 2)) {
        if (stack != null) {
            states[slot] = stack.copy();
            states[slot].stackSize = 1;
        }
    }else
        if (slot >= 0) {
            this.getStorageHandler().setItemInSlot((slot - 2), stack);
        }
    
}