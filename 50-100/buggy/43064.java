public boolean canFill(net.minecraftforge.fluids.FluidStack other, boolean fully) {
    return (other != null) && (isEmpty()) ? true : (fluid.isFluidEqual(other)) && ((!fully) || (canFill(other.amount)));
}