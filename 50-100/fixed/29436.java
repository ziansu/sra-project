@java.lang.Override
public void onBlockHarvested(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer player) {
    com.minesweeper.tileEntities.TileEntityMineFieldCompletionSearch compleitionSearch = ((com.minesweeper.tileEntities.TileEntityMineFieldCompletionSearch) (worldIn.getTileEntity(pos)));
    if (compleitionSearch != null) {
        if (compleitionSearch.IsMineFieldCompleted(worldIn)) {
            compleitionSearch.ClearField(worldIn);
        }
    }
}