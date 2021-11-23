@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    return this.getDefaultState().withProperty(com.bioxx.tfc2.blocks.BlockLogVertical2.META_PROPERTY, com.bioxx.tfc2.api.types.WoodType.getTypeFromMeta((meta + 16)));
}