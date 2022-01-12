public static java.util.List<cofh.thermalexpansion.plugins.jei.fuels.magmatic.MagmaticFuelWrapper> getRecipes(mezz.jei.api.IModRegistry registry, mezz.jei.api.IGuiHelper guiHelper) {
    java.util.List<cofh.thermalexpansion.plugins.jei.fuels.magmatic.MagmaticFuelWrapper> recipes = new java.util.ArrayList<>();
    for (java.lang.String fluidName : cofh.thermalexpansion.util.managers.dynamo.CompressionManager.getFuels()) {
        net.minecraftforge.fluids.FluidStack fuelStack = new net.minecraftforge.fluids.FluidStack(net.minecraftforge.fluids.FluidRegistry.getFluid(fluidName), net.minecraftforge.fluids.Fluid.BUCKET_VOLUME);
        recipes.add(new cofh.thermalexpansion.plugins.jei.fuels.magmatic.MagmaticFuelWrapper(guiHelper, fuelStack, cofh.thermalexpansion.util.managers.dynamo.MagmaticManager.getFuelEnergy(fuelStack)));
    }
    return recipes;
}