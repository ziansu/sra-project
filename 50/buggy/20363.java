public static net.minecraft.item.ItemStack getCookingResult(net.minecraft.item.ItemStack stack) {
    return net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingResult(stack).copy();
}