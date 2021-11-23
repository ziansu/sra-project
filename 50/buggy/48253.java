public final void updateState() {
    if (worldObj.isRemote) {
        return ;
    }
    markDirty();
    this.worldObj.markBlockForUpdate(pos);
}