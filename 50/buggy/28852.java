private void writeNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    nbt.setInteger("bloodTimer", bloodTimer);
    nbt.setFloat("bloodExhaustionLevel", bloodExhaustionLevel);
    nbt.setFloat("bloodSaturationlevel", bloodSaturationLevel);
    nbt.setBoolean("sleepingCoffin", sleepingCoffin);
}