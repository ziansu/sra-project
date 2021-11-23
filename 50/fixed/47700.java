@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    this.tank.writeToNBT(tag);
    tag.setInteger("process", this.process);
    return super.writeToNBT(tag);
}