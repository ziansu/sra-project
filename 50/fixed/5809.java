@java.lang.Override
public boolean canPlaceBlockAt(net.minecraft.world.World world, int x, int y, int z) {
    if (world.isSideSolid(x, (y - 1), z, net.minecraftforge.common.util.ForgeDirection.UP)) {
        return true;
    }else {
        return false;
    }
}