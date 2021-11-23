public boolean canFill(net.minecraftforge.fluids.FluidStack other, boolean fully) {
    return ((other == null) || (isEmpty())) || ((fluid.isFluidEqual(other)) && ((!fully) || (canFill(other.amount))));
}