@java.lang.Override
public int[] getSlotsForFace(net.minecraft.util.EnumFacing side) {
    return side == (net.minecraft.util.EnumFacing.UP) ? new int[]{ 0 } : side == (net.minecraft.util.EnumFacing.DOWN) ? new int[]{ 1 } : new int[]{ 0 , 1 };
}