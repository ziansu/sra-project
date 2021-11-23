public void registerBlocks() {
    for (net.minecraftforge.fluids.Fluid fluid : com.builtbroken.mc.fluids.fluid.FluidHelper.generatedFluids) {
        net.minecraft.block.Block block = com.builtbroken.mc.fluids.fluid.FluidHelper.createBlockForFluidIfMissing(fluid);
        if (block != null) {
            net.minecraftforge.fml.common.registry.GameRegistry.register(block);
        }
    }
}