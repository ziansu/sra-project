public final void updateState() {
    if (worldObj.isRemote) {
        return ;
    }
    markDirty();
}