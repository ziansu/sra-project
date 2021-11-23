public float getFillPercentage() {
    net.minecraftforge.fluids.FluidStack fluidStack = tank.getFluid();
    if (fluidStack == null)
        return 0;
    
    return ((float) (tank.getFluidAmount())) / ((float) (capacity));
}