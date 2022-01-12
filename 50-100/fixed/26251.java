public static void register3x3CompressionRecipe(net.minecraft.item.ItemStack ingredient, net.minecraft.item.ItemStack result, boolean uncraftable) {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(result, "III", "III", "III", 'I', ingredient);
    net.minecraftforge.fml.common.registry.GameRegistry.addShapelessRecipe(new net.minecraft.item.ItemStack(ingredient.getItem(), 9, ingredient.getItemDamage()), new net.minecraft.item.ItemStack(result.getItem(), 1, result.getItemDamage()));
}