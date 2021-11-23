@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.readFromNBT(nbt);
    this.burnTimeLeft = nbt.getInteger("burnTime");
    this.cookTimeLeft = nbt.getInteger("cookTimeLeft");
    this.cooking = new net.minecraft.item.ItemStack(((net.minecraft.nbt.NBTTagCompound) (nbt.getTag("cookingItem"))));
}