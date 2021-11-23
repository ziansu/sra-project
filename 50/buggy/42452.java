@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    this.helper.readFromNBT(compound, "e");
}