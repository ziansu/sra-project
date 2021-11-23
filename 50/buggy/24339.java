@java.lang.Override
public net.minecraftforge.fluids.FluidStack drain(net.minecraftforge.fluids.FluidStack resource, boolean doDrain) {
    if (resource.isFluidEqual(ModFluids.fluidStackToxicWaste)) {
        return drain(resource, doDrain);
    }
    return null;
}