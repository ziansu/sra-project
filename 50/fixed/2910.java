@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound dataTag) {
    this.writeNBT(dataTag);
    return super.writeToNBT(dataTag);
}