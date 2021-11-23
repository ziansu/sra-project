public static net.minecraft.item.ItemStack getCookingResult(net.minecraft.item.ItemStack stack) {
    if (stack != null) {
        return net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingResult(stack).copy();
    }
    return null;
}