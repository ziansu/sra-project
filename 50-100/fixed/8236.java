private net.minecraft.item.ItemStack getFirstStackHasBlock() {
    for (int i = 0; i < (inItems.getSlots()); ++i) {
        if (!(inItems.getStackInSlot(i).isEmpty()))
            return inItems.getStackInSlot(i);
        
    }
    return net.minecraft.item.ItemStack.EMPTY;
}