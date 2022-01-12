@java.lang.Override
public net.minecraft.item.ItemStack removeStackFromSlot(int i) {
    if (i >= (inventoryContents.length))
        return net.minecraft.item.ItemStack.EMPTY;
    
    if ((inventoryContents[i]) != (net.minecraft.item.ItemStack.EMPTY)) {
        net.minecraft.item.ItemStack itemstack = inventoryContents[i];
        inventoryContents[i] = net.minecraft.item.ItemStack.EMPTY;
        return itemstack;
    }
    return net.minecraft.item.ItemStack.EMPTY;
}