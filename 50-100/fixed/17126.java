@java.lang.Override
public void apply() {
    gregtech.api.enums.GT_Values.RA.addBlastRecipe(minetweaker.api.minecraft.MineTweakerMC.getItemStack(input[0]), ((input.length) > 1 ? minetweaker.api.minecraft.MineTweakerMC.getItemStack(input[1]) : null), minetweaker.api.minecraft.MineTweakerMC.getLiquidStack(null), minetweaker.api.minecraft.MineTweakerMC.getLiquidStack(null), minetweaker.api.minecraft.MineTweakerMC.getItemStack(output[0]), ((output.length) > 1 ? minetweaker.api.minecraft.MineTweakerMC.getItemStack(output[1]) : null), duration, euPerTick, heat);
}