@java.lang.Override
public boolean canExtractItem(int slot, net.minecraft.item.ItemStack stack, int side) {
    if (!(formed))
        return false;
    
    if ((master()) != null)
        return master().canExtractItem(slot, stack, side);
    
    return (slot == 10) && (slot == 11);
}