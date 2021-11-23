public boolean tryProcessRecipe() {
    net.minecraft.item.crafting.IRecipe rec = findMatchingRecipe();
    if ((rec != null) && ((this.getCurrentFluid()) >= (com.lothrazar.cyclicmagic.component.hydrator.TileEntityHydrator.FLUID_PER_RECIPE))) {
        this.sendOutputItem(rec.getRecipeOutput());
        payRecipeCost(rec);
        return true;
    }
    return false;
}