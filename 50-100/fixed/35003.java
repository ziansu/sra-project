@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    if (!(state.getValue(twilightforest.block.BlockTFCastleDoor.ACTIVE))) {
        if (twilightforest.block.BlockTFCastleDoor.isBlockLocked(world, pos)) {
            world.playSound(null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 1.0F, 0.3F);
        }else {
            twilightforest.block.BlockTFCastleDoor.changeToActiveBlock(world, pos, state);
        }
        return true;
    }else {
        return false;
    }
}