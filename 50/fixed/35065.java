protected net.minecraft.block.state.BlockStateContainer createRealBlockState() {
    return new net.minecraftforge.common.property.ExtendedBlockState(this, new net.minecraft.block.properties.IProperty[]{ stringProp }, new net.minecraftforge.common.property.IUnlistedProperty[]{ unlistedStringProp });
}