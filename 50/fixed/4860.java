@java.lang.Override
protected void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbttagcompound) {
    super.writeEntityToNBT(nbttagcompound);
    if ((theTank) != null) {
        this.theTank.writeToNBT(nbttagcompound.getCompoundTag("tank"));
    }
}