@java.lang.Override
protected void readEntityFromNBT(@javax.annotation.Nonnull
net.minecraft.nbt.NBTTagCompound compound) {
    hasRider = compound.getBoolean("rider");
    index = compound.getInteger("index");
    if ((index) <= 0) {
        origin = new net.minecraft.util.math.BlockPos(posX, posY, posZ);
    }else
        if (!(list.isEmpty())) {
            origin = list.get(((index) - 1));
        }
    
}