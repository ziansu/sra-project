private boolean checkHeadBlock(@org.jetbrains.annotations.Nullable
com.minecolonies.entity.pathfinding.Node parent, @org.jetbrains.annotations.NotNull
net.minecraft.util.math.BlockPos pos) {
    if (!(isPassable(pos.up()))) {
        return true;
    }
    if (parent != null) {
        net.minecraft.block.state.IBlockState hereState = world.getBlockState(parent.pos.down());
        if ((hereState.getMaterial().isLiquid()) && (!(isPassable(pos)))) {
            return true;
        }
    }
    return false;
}