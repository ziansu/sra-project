public net.minecraftforge.fluids.FluidStack getUsableFluid() {
    net.minecraftforge.fluids.FluidStack stack = this.fluid.copy();
    stack.amount = (stack.amount) - (locked);
    return stack;
}