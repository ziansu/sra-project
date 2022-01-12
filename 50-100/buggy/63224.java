@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    if ((net.minecraft.tileentity.TileEntityFurnace.isItemFuel(stack)) || ((stack.getItem()) instanceof moze_intel.projecte.api.item.IItemEmc))
        return super.insertItem(slot, stack, simulate);
    else
        return null;
    
}