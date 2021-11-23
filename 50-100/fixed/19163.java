@java.lang.Override
public int[] getSlotsForFace(net.minecraft.util.EnumFacing side) {
    int[] array = new int[inv.size()];
    for (int i = 0; i < (inv.size()); i++) {
        array[i] = i;
    }
    return array;
}