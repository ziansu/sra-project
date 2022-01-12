public int getTileMeta(net.minecraft.world.IBlockAccess blockAccess, int x, int y, int z) {
    return (blockAccess.getTileEntity(x, y, z)) != null ? getTileMeta(blockAccess.getTileEntity(x, y, z).getWorldObj(), x, y, z) : 0;
}