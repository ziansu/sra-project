public void setShieldBlock(net.minecraft.util.BlockPos c) {
    shieldBlock = c;
    markDirty();
    worldObj.markBlockForUpdate(getPos());
}