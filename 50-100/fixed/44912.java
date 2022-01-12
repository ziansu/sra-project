public int[] getVertexIndexArray() {
    int[] v = new int[getSize()];
    for (int i = 0; i < (getSize()); i++) {
        v[i] = (getVertexIndex(i)) - 1;
    }
    return v;
}