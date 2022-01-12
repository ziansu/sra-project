private boolean onRequestSingleRecipeOutput(elec332.craftingtableiv.blocks.slot.SlotCrafter slot) {
    elec332.craftingtableiv.abstraction.handler.WrappedRecipe recipe = slot.getIRecipe();
    return (recipe != null) && (elec332.craftingtableiv.abstraction.handler.CraftingHandler.canCraft(elec332.craftingtableiv.abstraction.handler.CraftingHandler.forCraftingTableIV(thePlayer, theTile), recipe, new elec332.craftingtableiv.abstraction.handler.FastRecipeList(craftableRecipes.getAllRecipes()), true));
}