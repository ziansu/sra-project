private void deallocate() {
    java.lang.Object[] temp = new java.lang.Object[(data.length) / (data_srtuctures.Heap.DEFAULT_INCREASE_FACTOR)];
    java.lang.System.arraycopy(data, 0, temp, 0, data.length);
    data = temp;
}