@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    if (useBindings) {
        if (((slot >= 0) && (slot < 9)) && ((bindings[slot]) >= 0)) {
            return inputInv.getStackInSlot(bindings[slot]);
        }else {
            return null;
        }
    }
    return super.getStackInSlot(slot);
}