boolean equals(int itemID, int meta, net.minecraft.nbt.NBTTagCompound nbt) {
    return (((this.itemID) == itemID) && ((this.meta) == meta)) && (((this.nbt) == nbt) || (((this.nbt) != null) && (this.nbt.equals(nbt))));
}