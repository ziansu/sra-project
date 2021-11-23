@java.lang.Override
public void setStackInSlot(int slot, net.minecraft.item.ItemStack stack) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = getSlotFromIndex(slot, index);
    handler.setStackInSlot(slot, stack);
}