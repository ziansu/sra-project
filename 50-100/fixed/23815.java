@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    net.minecraft.block.state.IBlockState state = this.getDefaultState();
    state = state.withProperty(jayavery.geomastery.blocks.BlockDoor.OPEN, ((meta & 8) > 0));
    state = state.withProperty(jayavery.geomastery.blocks.BlockDoor.TOP, ((meta & 4) > 0));
    state = state.withProperty(jayavery.geomastery.blocks.BlockDoor.FACING, net.minecraft.util.EnumFacing.getHorizontal(meta));
    return state;
}