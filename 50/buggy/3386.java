@java.lang.Override
public int getPartition(dsp2015.types.PathKey pathKey, dsp2015.types.PathValue pathValue, int i) {
    return (pathKey.getPath().hashCode()) % i;
}