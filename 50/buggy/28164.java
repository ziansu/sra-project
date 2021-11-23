@java.lang.Override
protected net.minecraft.block.state.BlockStateContainer createBlockState() {
    return new net.minecraft.block.state.BlockStateContainer(this, getEngineProperty(), buildcraft.api.properties.BuildCraftProperties.ENERGY_STAGE, buildcraft.api.properties.BuildCraftProperties.BLOCK_FACING_6);
}