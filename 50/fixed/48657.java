@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.readFromNBT(nbt);
    heat.load(nbt, "heat");
    fuel = nbt.getFloat("fuel");
    burnRate = nbt.getFloat("burn");
}