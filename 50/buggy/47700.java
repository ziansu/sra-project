@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    this.tank.writeToNBT(tag);
    tag.setInteger("process", this.process);
}