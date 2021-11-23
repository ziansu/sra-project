private static void saveOfflineNBT(java.util.UUID uuid, boolean remove) {
    net.minecraft.nbt.NBTTagCompound nbt = com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.getOfflinePlayerNBT(uuid);
    com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.map.put(uuid, nbt);
    com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.writeOfflinePlayerNBT(uuid, remove);
}