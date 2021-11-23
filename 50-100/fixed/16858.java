public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    if (((stack != null) && ((stack.getItem()) instanceof net.minecraft.item.ItemFood)) && ((net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingResult(stack)) != null)) {
        return super.insertItem(slot, stack, simulate);
    }
    return stack;
}