@java.lang.Override
public void beginLeavesDecay(net.minecraft.world.World world, int x, int y, int z) {
    forestry.arboriculture.gadgets.TileLeaves tile = forestry.arboriculture.gadgets.ForestryBlockLeaves.getLeafTile(world, x, y, z);
    if ((tile != null) && (tile.isDecorative()))
        return ;
    
    world.setBlockMetadataWithNotify(x, y, z, ((world.getBlockMetadata(x, y, z)) | 8), 4);
    if (world.isRemote)
        world.markBlockForUpdate(x, y, z);
    
}