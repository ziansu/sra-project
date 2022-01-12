public net.minecraft.item.ItemStack getSmeltingResult(net.minecraft.item.ItemStack stack) {
    java.util.Iterator<java.util.Map.Entry<net.einsteinsci.betterbeginnings.register.recipe.OreRecipeElement, net.minecraft.item.ItemStack>> iterator = smeltingList.entrySet().iterator();
    java.util.Map.Entry<net.einsteinsci.betterbeginnings.register.recipe.OreRecipeElement, net.minecraft.item.ItemStack> entry;
    do {
        if (!(iterator.hasNext())) {
            return null;
        }
        entry = iterator.next();
    } while (!(canBeSmelted(stack, entry.getKey())) );
    return entry.getValue();
}