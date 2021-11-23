@javax.annotation.Nonnull
@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(@javax.annotation.Nullable
net.minecraft.world.World worldIn, int meta) {
    com.corwinjv.mobtotems.blocks.tiles.IncenseKindlingBoxTileEntity te = new com.corwinjv.mobtotems.blocks.tiles.IncenseKindlingBoxTileEntity();
    te.setCreationTime(worldIn.getTotalWorldTime());
    return te;
}