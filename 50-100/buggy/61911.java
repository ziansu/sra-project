public static void register2x2CompressionRecipe(net.minecraft.item.ItemStack ingredient, net.minecraft.item.ItemStack result, boolean uncraftable) {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(ingredient, "II", "II", 'I', result);
    net.minecraftforge.fml.common.registry.GameRegistry.addShapelessRecipe(new net.minecraft.item.ItemStack(ingredient.getItem(), 4, ingredient.getItemDamage()), new net.minecraft.item.ItemStack(result.getItem(), 1, result.getItemDamage()));
}