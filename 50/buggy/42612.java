@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    this.playerID = java.util.UUID.fromString(compound.getString("player_id"));
    super.readFromNBT(compound);
}