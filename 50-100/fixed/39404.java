@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    return (((stack != null) && ((stack.getItem()) != null)) && (slot == 0)) && (((stack.getItem()) instanceof net.minecraftforge.fluids.IFluidContainerItem) || (net.minecraftforge.fluids.FluidContainerRegistry.isContainer(stack)));
}