@java.lang.Override
protected void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound nbttagcompound) {
    super.readEntityFromNBT(nbttagcompound);
    cargoItems.setSize(this.getInventorySize());
    cargoItems.deserializeNBT(((net.minecraft.nbt.NBTTagCompound) (nbttagcompound.getTag("items"))));
    handleMass();
}