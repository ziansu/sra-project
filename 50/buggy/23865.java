public void sortRecipes(java.util.Comparator<net.minecraft.item.ItemStack> comparator) {
    currentSort = comparator;
    java.util.Collections.sort(sortedRecipes, comparator);
    updateRecipeList();
    sortingChanged();
    isRecipeListDirty = true;
}