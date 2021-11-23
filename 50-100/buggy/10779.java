public static void writeNBTFound(net.minecraft.nbt.NBTTagCompound nbt, net.minecraft.util.math.BlockPos pos) {
    nbt.setBoolean("found", true);
    nbt.removeTag("searchStarted");
    nbt.setInteger("posX", pos.getX());
    nbt.setInteger("posZ", pos.getZ());
}