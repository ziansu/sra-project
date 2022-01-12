@java.lang.Override
public net.minecraft.block.state.IBlockState getExtendedState(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.BlockPos pos) {
    net.minecraftforge.client.model.b3d.B3DLoader.B3DState newState = new net.minecraftforge.client.model.b3d.B3DLoader.B3DState(null, counter);
    return ((net.minecraftforge.common.property.IExtendedBlockState) (state)).withProperty(B3DLoader.B3DFrameProperty.instance, newState);
}