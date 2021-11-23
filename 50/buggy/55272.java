public static final void createFluids() {
    net.minecraftforge.fluids.FluidRegistry.enableUniversalBucket();
    (mekfarm.common.FluidsRegistry.sewage = new mekfarm.fluids.SewageFluid()).register();
}