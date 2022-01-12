public static void registerFluids() {
    if (!(net.minecraftforge.fluids.FluidRegistry.isFluidRegistered("milk"))) {
        net.minecraftforge.fluids.Fluid milk = new net.minecraftforge.fluids.Fluid("milk").setUnlocalizedName(Names.Fluids.MILK);
        net.minecraftforge.fluids.FluidRegistry.registerFluid(milk);
        net.minecraftforge.fluids.FluidContainerRegistry.registerFluidContainer(new net.minecraftforge.fluids.FluidStack(milk, 1000), new net.minecraft.item.ItemStack(net.minecraft.init.Items.milk_bucket), new net.minecraft.item.ItemStack(net.minecraft.init.Items.bucket));
    }
}