@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    if ((slot < 0) || (slot >= (filters.length)))
        return net.minecraft.item.ItemStack.EMPTY;
    
    return filters[slot];
}