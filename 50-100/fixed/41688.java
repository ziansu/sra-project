@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    burnTime = compound.getInteger("BurnTime");
    cookTime = compound.getInteger("CookTime");
    totalCookTime = compound.getInteger("CookTimeTotal");
    currentItemBurnTime = net.minecraft.tileentity.TileEntityFurnace.getItemBurnTime(getFuelItemStack());
    furnaceItemStacks = net.minecraft.util.NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
    net.minecraft.inventory.ItemStackHelper.loadAllItems(compound, furnaceItemStacks);
    if (compound.hasKey("CustomName", 8)) {
        setCustomInventoryName(compound.getString("CustomName"));
    }
}