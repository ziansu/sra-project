private boolean canCookAnything() {
    for (int i = 0; i < (inventory().getSlots()); i++) {
        if (!(net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingResult(items.getStackInSlot(i)).copy().isEmpty())) {
            return true;
        }
    }
    return false;
}