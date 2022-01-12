public int getFluidLightLevel(int tankN) {
    com.nik7.upgcraft.tileentities.FluidStack stack = tank[tankN].getFluid();
    if (stack != null) {
        com.nik7.upgcraft.tileentities.Fluid fluid = stack.getFluid();
        if (fluid != null)
            return fluid.getLuminosity();
        
    }
    return 0;
}