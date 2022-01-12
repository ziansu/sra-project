public net.minecraftforge.common.util.ForgeDirection getFacing(int meta) {
    return net.minecraftforge.common.util.ForgeDirection.getOrientation(((meta & 3) + 2));
}