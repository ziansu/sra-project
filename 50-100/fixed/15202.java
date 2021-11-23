public static boolean canSpawnMob(net.minecraft.world.World world, int x, int y, int z) {
    net.minecraft.block.Block id = world.getBlock(x, y, z);
    if ((!(CoroUtil.util.CoroUtilBlock.isAir(id))) && ((id.getMaterial()) == (net.minecraft.block.material.Material.leaves))) {
        return false;
    }
    return true;
}