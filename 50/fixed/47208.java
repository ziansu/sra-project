public void setShieldBlock(net.minecraft.util.BlockPos c) {
    shieldBlock = c;
    markDirty();
    if ((worldObj) != null) {
        worldObj.markBlockForUpdate(getPos());
    }
}