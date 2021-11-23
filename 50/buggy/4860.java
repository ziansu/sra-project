@java.lang.Override
protected void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbttagcompound) {
    super.writeEntityToNBT(nbttagcompound);
    this.theTank.writeToNBT(nbttagcompound.getCompoundTag("tank"));
}