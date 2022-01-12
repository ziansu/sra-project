@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    if ((this.playerID) != null)
        compound.setString("player_id", this.playerID.toString());
    
    super.writeToNBT(compound);
    return compound;
}