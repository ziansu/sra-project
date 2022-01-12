@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    if (!(compound.getString("player_id").isEmpty()))
        this.playerID = java.util.UUID.fromString(compound.getString("player_id"));
    
    super.readFromNBT(compound);
}