public static boolean canCraft(net.minecraft.item.ItemStack item, com.custommods.ai.AIinventory inve) {
    java.util.List<net.minecraft.item.ItemStack> items = com.custommods.ai.RecipesList.getIngredientList(item);
    if (items == null) {
        return false;
    }
    for (net.minecraft.item.ItemStack itemStack : items) {
        if (!(inve.haveItem(itemStack))) {
            return false;
        }
    }
    return true;
}