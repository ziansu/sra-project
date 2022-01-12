@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    super.setInventorySlotContents(slot, stack);
    if ((stack != null) && (!(stack.isEmpty())))
        destinationId = -1;
    
}