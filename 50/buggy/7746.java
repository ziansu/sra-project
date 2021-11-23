@javax.annotation.Nullable
@java.lang.Override
public net.minecraft.item.ItemStack getCraftingResult(com.dyonovan.researchsystem.events.InventoryCrafting inv) {
    return (recipe) == null ? null : recipe.getRecipeOutput().copy();
}