@java.lang.Override
public void getElements(double[] dest, int destOffset, int[] indices) {
    int n = indices.length;
    int offset = getArrayOffset();
    int stride = getStride();
    for (int i = 0; i < n; i++) {
        dest[(destOffset + i)] = dest[(offset + (stride * (indices[i])))];
    }
}