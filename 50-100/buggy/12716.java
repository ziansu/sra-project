@java.lang.Override
public boolean addUniversalDistillationRecipe(net.minecraftforge.fluids.FluidStack aInput, net.minecraftforge.fluids.FluidStack[] aOutputs, net.minecraft.item.ItemStack aOutput2, int aDuration, int aEUt) {
    for (int i = 0; i < (java.lang.Math.min(aOutputs.length, 11)); i++) {
        addDistilleryRecipe(gregtech.api.util.GT_Utility.getIntegratedCircuit(i), aInput, aOutputs[i], (aDuration * 2), (aEUt / 4), false);
    }
    return addDistillationTowerRecipe(aInput, aOutputs, aOutput2, aDuration, aEUt);
}