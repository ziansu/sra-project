public static void writeNBTNotFound(net.minecraft.nbt.NBTTagCompound nbt) {
    nbt.setBoolean("found", false);
    nbt.removeTag("searchStarted");
    nbt.removeTag("posX");
    nbt.removeTag("posZ");
}