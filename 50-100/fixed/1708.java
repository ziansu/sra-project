@java.lang.Override
public boolean isSiftable(net.minecraft.block.state.IBlockState state, int meshLevel) {
    java.util.List<exnihiloadscensio.registries.types.Siftable> siftables = exnihiloadscensio.registries.SieveRegistry.getDrops(new exnihiloadscensio.util.BlockInfo(state));
    if (siftables != null) {
        for (exnihiloadscensio.registries.types.Siftable siftable : siftables) {
            if ((siftable.getMeshLevel()) == meshLevel) {
                return true;
            }
        }
    }
    return false;
}