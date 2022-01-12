@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    if (resource.isFluidEqual(ModFluids.fluidStackDeuterium)) {
        tankInputDeuterium.fill(resource, doFill);
    }else
        if (resource.isFluidEqual(ModFluids.fluidStackTritium)) {
            tankInputTritium.fill(resource, doFill);
        }
    
    return 0;
}