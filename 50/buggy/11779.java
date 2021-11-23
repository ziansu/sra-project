private static boolean doesRecipeProduce(ic2.api.recipe.RecipeOutput recipe, net.minecraft.item.ItemStack... items) {
    for (net.minecraft.item.ItemStack output : recipe.items) {
        if (mods.railcraft.common.util.inventory.InvTools.isItemEqual(output, items))
            return true;
        
    }
    return false;
}