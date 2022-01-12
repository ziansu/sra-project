@java.lang.Override
public void updateEntity() {
    if (worldObj.isRemote) {
        worldObj.markBlockRangeForRenderUpdate(((xCoord) - 10), ((yCoord) - 10), ((zCoord) - 10), ((xCoord) + 10), ((yCoord) + 10), ((zCoord) + 10));
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }else {
        updateState();
    }
}