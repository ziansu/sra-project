@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void forceFillTank(net.minecraftforge.fluids.FluidStack stack) {
    if (stack != null)
        this.fluidInv = stack.copy();
    
}