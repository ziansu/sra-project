protected void setRedstoneState(boolean newout) {
    markDirty();
    worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
}