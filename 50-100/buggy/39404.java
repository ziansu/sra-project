@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    net.minecraft.item.ItemStack itemStack = getStackInSlot(0);
    return (((stack != null) && (slot == 0)) && (((stack.getItem()) instanceof net.minecraftforge.fluids.IFluidContainerItem) || (net.minecraftforge.fluids.FluidContainerRegistry.isContainer(stack)))) && (((itemStack == null) || ((itemStack.getItem()) == null)) || (((itemStack.stackSize) + (stack.stackSize)) <= 1));
}