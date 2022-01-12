@java.lang.Override
public int getPartition(dsp2015.types.PathKey pathKey, dsp2015.types.PathValue pathValue, int i) {
    int n = (pathKey.getPath().hashCode()) + (163 * (pathKey.getSlot().get() ? 11 : 7));
    return n % i;
}