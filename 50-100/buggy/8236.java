private net.minecraft.item.ItemStack getFirstStackHasBlock() {
    for (int i = 0; i < (inItems.getSlots()); ++i) {
        if ((!(inItems.getStackInSlot(i).isEmpty())) && (!(net.minecraft.block.Block.getBlockFromItem(inItems.getStackInSlot(i).getItem()).equals(Blocks.AIR))))
            return inItems.getStackInSlot(i);
        
    }
    return net.minecraft.item.ItemStack.EMPTY;
}