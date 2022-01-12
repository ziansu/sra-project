@java.lang.Override
public net.minecraftforge.fluids.FluidStack drain(net.minecraftforge.fluids.FluidStack resource, boolean doDrain) {
    if (resource.isFluidEqual(ModFluids.fluidStackToxicWaste)) {
        return super.drain(resource, doDrain);
    }
    return null;
}