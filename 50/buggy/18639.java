@java.lang.Override
protected final net.minecraft.block.state.BlockStateContainer createBlockState() {
    if (this.isDouble()) {
        return new net.minecraft.block.state.BlockStateContainer(this, ModBlockSlab.VARIANT_PROPERTY);
    }else {
        return new net.minecraft.block.state.BlockStateContainer(this, ModBlockSlab.VARIANT_PROPERTY, HALF);
    }
}