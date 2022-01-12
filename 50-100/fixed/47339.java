public void onDestroy() {
    if (validPortal) {
        net.minecraft.tileentity.TileEntity te = worldObj.getTileEntity(coreX, coreY, coreZ);
        if ((te != null) && (te instanceof com.fravokados.mindim.block.tile.TileEntityPortalControllerEntity)) {
            if (((com.fravokados.mindim.block.tile.TileEntityPortalControllerEntity) (te)).isActive()) {
                worldObj.createExplosion(null, xCoord, yCoord, zCoord, 2.0F, false);
                ((com.fravokados.mindim.block.tile.TileEntityPortalControllerEntity) (te)).closePortal(true);
            }
        }
    }
}