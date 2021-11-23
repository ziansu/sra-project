@java.lang.Override
public void getDrops(net.minecraft.util.NonNullList<net.minecraft.item.ItemStack> drops, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, int fortune) {
    java.util.List<net.minecraft.item.ItemStack> ret = this.drops.get();
    this.drops.remove();
    if (ret != null) {
        drops.addAll(ret);
    }else {
        if (!(world instanceof net.minecraft.world.World)) {
            return ;
        }
        getLeafDrop(drops, ((net.minecraft.world.World) (world)), null, pos, 1.0F, fortune);
    }
}