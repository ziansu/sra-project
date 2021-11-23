@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    tag.setInteger("upgradeCount", upgradeCount);
    if ((targetDirection) != null) {
        tag.setInteger("direction", targetDirection.ordinal());
    }
    if ((owner) != null) {
        tag.setString("owner", owner.toString());
    }
}