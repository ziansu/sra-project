@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    if (resource.isFluidEqual(ModFluids.fluidStackPlasma)) {
        return super.fill(resource, doFill);
    }
    return 0;
}