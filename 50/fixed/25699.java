@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    if (compound.getString(LibNBT.ownerUUID).isEmpty())
        owner = java.util.UUID.fromString(compound.getString(LibNBT.ownerUUID));
    
}