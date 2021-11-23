@java.lang.Override
public net.minecraft.nbt.NBTTagCompound serializeNBT() {
    net.minecraft.nbt.NBTTagCompound nbt = new net.minecraft.nbt.NBTTagCompound();
    net.minecraft.nbt.NBTTagList uuids_nbt = new net.minecraft.nbt.NBTTagList();
    for (java.util.UUID uuid : cap.getUnlockableUUIDs()) {
        uuids_nbt.appendTag(lu.kremi151.minamod.util.MinaUtils.convertUUIDToNBT(uuid));
    }
    nbt.setTag("Unlockables", uuids_nbt);
    nbt.setInteger("Tint", cap.tint);
    nbt.setByte("State", ((byte) (cap.state.id)));
    return nbt;
}