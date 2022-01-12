@java.lang.Override
public int getPartition(dsp2015.types.PathKey pathKey, dsp2015.types.PathValue pathValue, int i) {
    return java.lang.Math.abs(((pathKey.getPath().hashCode()) % i));
}