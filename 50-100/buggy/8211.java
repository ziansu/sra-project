private boolean matches(java.lang.String oreDict) {
    java.util.ArrayList<net.minecraft.item.ItemStack> listStacks = net.minecraftforge.oredict.OreDictionary.getOres(oreDict);
    for (net.minecraft.item.ItemStack stack : listStacks) {
        if ((net.minecraftforge.oredict.OreDictionary.itemMatches(stack, input, true)) && (ingredient.isItemEqual(this.ingredient))) {
            return true;
        }
    }
    return false;
}