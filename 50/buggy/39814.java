@java.lang.Override
public void updateTick(net.minecraft.world.World worldIn, micdoodle8.mods.galacticraft.core.blocks.BlockPos pos, net.minecraft.block.state.IBlockState state, java.util.Random rand) {
    if ((getMetaFromState(state)) == 0) {
        this.onBlockAdded(worldIn, pos, state);
    }
}