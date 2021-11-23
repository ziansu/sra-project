@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    if ((this.getStackInSlot(slot)) != null) {
        if (gunn.modcurrency.mod.utils.UtilMethods.equalStacks(this.getStackInSlot(slot), stack)) {
            if (isGhost(slot)) {
                setGhost(slot, false);
                (stack.stackSize)--;
            }
            return super.insertItem(slot, stack, simulate);
        }
        return stack;
    }
    return stack;
}