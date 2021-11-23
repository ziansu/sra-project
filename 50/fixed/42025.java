@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(net.minecraft.world.World worldIn, int meta) {
    java.lang.System.out.println(meta);
    return new com.mraof.minestuck.tileentity.TileEntityPunchDesignix();
}