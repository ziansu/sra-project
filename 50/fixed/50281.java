public static int getRedstoneLevel(net.minecraft.world.World world, net.minecraft.util.BlockPos pos) {
    return world != null ? world.isBlockIndirectlyGettingPowered(pos) : 0;
}