public void set(net.minecraft.item.ItemStack itemStack) {
    if ((itemStack.getItem()) instanceof net.minecraft.item.ItemBlock)
        set(net.minecraft.block.Block.getBlockFromItem(itemStack.getItem()));
    
    this.itemStack = itemStack;
}