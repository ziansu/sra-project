@java.lang.Override
public int[] getSlotsForFace(net.minecraft.util.EnumFacing side) {
    int[] array = new int[inv.length];
    for (int i = 0; i < (inv.length); i++) {
        array[i] = i;
    }
    return array;
}