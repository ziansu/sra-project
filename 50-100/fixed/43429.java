public static net.minecraft.item.ItemStack drainContainer(@javax.annotation.Nonnull
net.minecraft.item.ItemStack container) {
    net.minecraft.item.ItemStack empty = container.copy();
    mcjty.lib.tools.ItemStackTools.setStackSize(empty, 1);
    net.minecraftforge.fluids.capability.IFluidHandler fluidHandler = net.minecraftforge.fluids.FluidUtil.getFluidHandler(empty);
    if (fluidHandler == null) {
        return net.minecraftforge.fluids.FluidContainerRegistry.drainFluidContainer(container);
    }
    if ((fluidHandler.drain(java.lang.Integer.MAX_VALUE, true)) != null) {
        return net.minecraftforge.fluids.FluidUtil.tryEmptyContainer(container, fluidHandler, java.lang.Integer.MAX_VALUE, null, true);
    }
    return mcjty.lib.tools.ItemStackTools.getEmptyStack();
}