@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ) {
    CommonProxy.snw.sendToServer(new x3d.utils.ServerMsg(pos));
    if (worldIn.getBlockState(pos).getValue(x3d.blocks.chromosoneblock.aboom)) {
        worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 12, true);
        return true;
    }
    return false;
}