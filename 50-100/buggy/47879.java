@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    compound.setInteger("power1", this.burningPower);
    compound.setInteger("power2", this.normalBurningPower);
    compound.setLong("fuelValue", this.fuelValue);
    this.helper.writeToNBT(this.nbt, "thermal");
    return super.writeToNBT(compound);
}