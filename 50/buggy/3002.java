@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    return (slot < (getSizeInventory())) && (isValid(stack));
}