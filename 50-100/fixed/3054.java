private static net.minecraft.item.ItemStack wrapSpecific(nova.core.recipes.crafting.SpecificItemIngredient ingredient) {
    for (nova.core.item.Item item : ingredient.getExampleItems().get()) {
        return Game.instance.nativeManager.toNative(item.factory().makeItem());
    }
    throw new java.lang.AssertionError("this can't be!");
}