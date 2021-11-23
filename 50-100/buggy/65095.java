public static int compare(net.malisis.core.util.Point offset, net.minecraft.util.math.BlockPos pos1, net.minecraft.util.math.BlockPos pos2) {
    if (pos1.equals(pos2))
        return 0;
    
    return (pos1.distanceSq(offset.x, offset.y, offset.z)) > (pos2.distanceSq(offset.x, offset.y, offset.z)) ? 1 : -1;
}