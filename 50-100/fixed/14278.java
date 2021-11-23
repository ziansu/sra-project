@java.lang.Override
public void setInventorySlotContents(int i, net.minecraft.item.ItemStack itemstack) {
    inventoryContents[i] = itemstack;
    if ((!(itemstack.isEmpty())) && ((itemstack.getCount()) > (getInventoryStackLimit())))
        itemstack.setCount(getInventoryStackLimit());
    
}