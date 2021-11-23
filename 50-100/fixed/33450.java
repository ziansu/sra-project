@java.lang.Override
public net.minecraft.block.state.IBlockState getActualState(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess access, buildcraft.core.lib.engines.BlockPos pos) {
    net.minecraft.tileentity.TileEntity tile = access.getTileEntity(pos);
    if (tile instanceof buildcraft.core.lib.engines.TileEngineBase) {
        buildcraft.core.lib.engines.TileEngineBase engine = ((buildcraft.core.lib.engines.TileEngineBase) (tile));
        state = state.withProperty(buildcraft.core.lib.engines.FACING_6_PROP, engine.orientation);
        state = state.withProperty(buildcraft.core.lib.engines.ENERGY_STAGE, engine.energyStage);
    }
    return state;
}