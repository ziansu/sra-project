public int getNeededMaterialCount(net.minecraft.item.Item material) {
    for (net.einsteinsci.betterbeginnings.register.recipe.OreRecipeElement stack : addedMaterials) {
        if (stack.matches(new net.minecraft.item.ItemStack(material))) {
            return stack.stackSize;
        }
    }
    return 0;
}