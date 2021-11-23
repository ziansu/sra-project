private static boolean doesRecipeRequire(ic2.api.recipe.IRecipeInput input, net.minecraft.item.ItemStack... items) {
    for (net.minecraft.item.ItemStack stack : input.getInputs()) {
        if (mods.railcraft.common.util.inventory.InvTools.isItemEqual(stack, items))
            return true;
        
    }
    return false;
}