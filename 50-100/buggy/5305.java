@java.lang.Override
public void breakBlock(net.minecraft.world.World worldIn, micdoodle8.mods.galacticraft.core.blocks.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    if (!(worldIn.isRemote)) {
        final int facing = (getMetaFromState(state)) & 8;
        if ((worldIn.provider) instanceof micdoodle8.mods.galacticraft.core.dimension.WorldProviderSpaceStation) {
            micdoodle8.mods.galacticraft.core.dimension.WorldProviderSpaceStation worldOrbital = ((micdoodle8.mods.galacticraft.core.dimension.WorldProviderSpaceStation) (worldIn.provider));
            worldOrbital.getSpinManager().removeThruster(pos, (facing == 0));
            worldOrbital.getSpinManager().updateSpinSpeed();
        }
    }
}