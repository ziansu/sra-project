public net.minecraft.nbt.NBTTagCompound saveDataToPacket() {
    updateTorchAge(getWorld().getTotalWorldTime());
    net.minecraft.nbt.NBTTagCompound dataPacket = new net.minecraft.nbt.NBTTagCompound();
    this.writeToNBT(dataPacket);
    return dataPacket;
}