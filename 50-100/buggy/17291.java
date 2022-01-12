@java.lang.Override
public void run() {
    net.torocraft.teletoro.blocks.BlockAbstractPortal.Size size = net.torocraft.teletoro.item.ItemTeletoryPortalLinker.STANDARD_SIZER.get(world, from.pos, from.axis);
    size.placePortalBlocks(null);
    size.placePortalBlocks(BlockLinkedTeletoryPortal.INSTANCE);
    if (world.isRemote) {
        return ;
    }
    net.torocraft.teletoro.blocks.TileEntityLinkedTeletoryPortal te = new net.torocraft.teletoro.blocks.TileEntityLinkedTeletoryPortal();
    te.setDimId(remoteDimId);
    te.setDestination(to.pos);
    te.setSide(remoteSide);
    world.setTileEntity(from.pos, te);
}