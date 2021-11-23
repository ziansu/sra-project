@java.lang.Override
public void setStackInSlot(int slot, net.minecraft.item.ItemStack stack) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = slot - (getSlotFromIndex(index));
    handler.setStackInSlot(slot, stack);
}