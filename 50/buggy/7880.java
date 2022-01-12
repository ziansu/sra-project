public static void writeNBTSearching(net.minecraft.nbt.NBTTagCompound nbt, net.minecraft.world.World world) {
    nbt.setBoolean("found", false);
    nbt.setLong("searchStarted", world.getWorldTime());
    nbt.removeTag("posX");
    nbt.removeTag("posZ");
}