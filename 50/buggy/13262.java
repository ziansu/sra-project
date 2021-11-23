@java.lang.Override
protected net.minecraft.block.state.BlockStateContainer createBlockState() {
    return new net.minecraftforge.common.property.ExtendedBlockState(this, new net.minecraft.block.properties.IProperty[]{ se.gory_moon.horsepower.blocks.BlockChopper.PART , se.gory_moon.horsepower.blocks.BlockChopper.DIRECTION }, new net.minecraftforge.common.property.IUnlistedProperty[]{ se.gory_moon.horsepower.blocks.BlockChopper.FACING });
}