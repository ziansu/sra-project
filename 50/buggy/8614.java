public boolean canDrain(net.minecraftforge.fluids.FluidStack other, boolean fully) {
    return (other != null) && (isEmpty()) ? false : fully ? fluid.containsFluid(other) : fluid.isFluidEqual(other);
}