public static java.util.List<alexiil.mods.civ.api.tech.TechTree.Tech> getTechs(net.minecraft.world.World world, net.minecraft.util.BlockPos pos) {
    return alexiil.mods.civ.utils.CraftUtils.getTechs(world, new net.minecraft.world.ChunkCoordIntPair(((pos.getX()) >> 4), ((pos.getZ()) >> 4)));
}