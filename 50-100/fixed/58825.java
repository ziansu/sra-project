@java.lang.Override
public boolean onWrench(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, eiteam.esteemedinnovation.boiler.EnumHand hand, eiteam.esteemedinnovation.boiler.EnumFacing facing, net.minecraft.block.state.IBlockState state, float hitX, float hitY, float hitZ) {
    if (player.isSneaking()) {
        return true;
    }
    if ((facing != (EnumFacing.DOWN)) && (facing != (EnumFacing.UP))) {
        eiteam.esteemedinnovation.commons.util.WorldHelper.rotateProperly(eiteam.esteemedinnovation.boiler.BlockBoiler.FACING, world, state, pos, facing);
    }
    return false;
}