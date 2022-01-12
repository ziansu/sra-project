@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    tag.setInteger("upgradeCount", upgradeCount);
    tag.setInteger("direction", targetDirection.ordinal());
    if ((owner) == null) {
        return ;
    }
    tag.setString("owner", owner.toString());
}