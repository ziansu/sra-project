@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    owner = java.util.UUID.fromString(compound.getString(LibNBT.ownerUUID));
}