@java.lang.Override
public void onEntityCollidedWithBlock(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.entity.Entity entityIn) {
    worldIn.destroyBlock(pos, false);
}