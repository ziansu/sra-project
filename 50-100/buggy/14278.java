@java.lang.Override
public void setInventorySlotContents(int i, net.minecraft.item.ItemStack itemstack) {
    inventoryContents[i] = itemstack;
    if ((itemstack != (net.minecraft.item.ItemStack.EMPTY)) && ((itemstack.getCount()) > (getInventoryStackLimit())))
        itemstack.setCount(getInventoryStackLimit());
    
}