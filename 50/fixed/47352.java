public static boolean canSmelt(net.minecraft.item.ItemStack item, com.custommods.ai.AIinventory inve) {
    net.minecraft.item.ItemStack result = com.custommods.ai.RecipesList.getSmeltingItem(item);
    if (result == null) {
        return false;
    }
    return inve.haveItem(result);
}