public de.teamlapen.vampirism.tileEntity.TileEntityCoffin getPrimaryTileEntity() {
    if (((this.worldObj.getBlockMetadata(this.otherX, this.yCoord, this.zCoord)) & (-8)) != 0)
        return ((de.teamlapen.vampirism.tileEntity.TileEntityCoffin) (worldObj.getTileEntity(otherX, otherY, otherZ)));
    
    return this;
}