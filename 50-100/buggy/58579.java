public void setCamoBlock(int camoId, int hasTe) {
    this.camoId = camoId;
    this.hasTe = hasTe;
    if (camoId == (-1)) {
        block = null;
    }else {
        block = net.minecraft.block.Block.getBlockById(camoId);
    }
    markDirty();
    worldObj.markBlockForUpdate(getPos());
}