@java.lang.Override
public void run() {
    size.placePortalBlocks(BlockLinkedTeletoryPortal.INSTANCE);
    net.torocraft.teletoro.blocks.TileEntityLinkedTeletoryPortal te = new net.torocraft.teletoro.blocks.TileEntityLinkedTeletoryPortal();
    te.setDimId(remoteDimId);
    te.setDestination(to.pos);
    te.setSide(remoteSide);
    world.setTileEntity(from.pos, te);
}