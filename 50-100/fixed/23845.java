@java.lang.Override
public void update() {
    super.update();
    if ((!(worldObj.isRemote)) && ((colonyId) == 0)) {
        throw new java.lang.IllegalStateException(java.lang.String.format("TileEntityColonyBuilding at %s:[%d,%d,%d] has no colonyId", worldObj.getWorldInfo().getWorldName(), pos.getX(), pos.getY(), pos.getZ()));
    }
}