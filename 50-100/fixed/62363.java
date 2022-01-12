@java.lang.Override
public net.minecraft.block.state.IBlockState getActualState(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess worldIn, net.minecraft.util.BlockPos pos) {
    net.minecraft.tileentity.TileEntity te = worldIn.getTileEntity(pos);
    if (te instanceof com.balrog.InfernalTech.tileentities.TileEntityEnergyChannel) {
        com.balrog.InfernalTech.tileentities.TileEntityEnergyChannel cte = ((com.balrog.InfernalTech.tileentities.TileEntityEnergyChannel) (te));
        return cte.getState(state);
    }
    return state;
}