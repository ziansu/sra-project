public boolean canBlockStay(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    if ((state.getValue(candy.redpowerreborn.block.BlockFlax.HALF)) == (BlockDoublePlant.EnumBlockHalf.UPPER)) {
        return (worldIn.getBlockState(pos.down()).getBlock()) == (this);
    }else {
        net.minecraft.block.state.IBlockState iblockstate = worldIn.getBlockState(pos.up());
        return ((iblockstate.getBlock()) == (this)) && (super.canBlockStay(worldIn, pos, iblockstate));
    }
}