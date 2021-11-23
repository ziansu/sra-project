private boolean canCookAnything() {
    for (int i = 0; i < (inventory().getSlots()); i++) {
        if (((this.items.getStackInSlot(i)) != null) && ((net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingResult(this.items.getStackInSlot(i))) != null)) {
            return true;
        }
    }
    return false;
}